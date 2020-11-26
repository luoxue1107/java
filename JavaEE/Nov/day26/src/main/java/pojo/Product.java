package pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 9:13
 */
public class Product {
    private Integer id;
    private String name;
    private Double price;
    private Integer number;
    private Double count;
    private Integer cid;


    public Product(Integer id, String name, Double price, Integer number, Double count, Integer cid) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.count = count;
        this.cid = cid;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

}
