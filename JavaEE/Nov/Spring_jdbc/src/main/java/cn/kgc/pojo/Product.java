package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/27 19:45
 */
public class Product {
    private Integer id;
    private String name;
    private Double price;

    public Product(Integer id, String name ,Double price) {
        this.id = id;
        this.name = name;
        this.price=price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
