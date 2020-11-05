package cn.kgc.tangcco.dao;

import cn.kgc.tangcco.pojo.Image;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/5 9:37
 */
public interface ImageDao {
    /**
     * 获取全部信息
     */
    List<Image> selectImages();

    /**
     *  插入一条数据
     * @param image 图片信息对象
     * @return
     */
    Integer insertImage(Image image);

    /**
     * 删除一条数据
     * @param id 图片编号
     * @return
     */
    Integer deleteImage(Integer id);

    /**
     *  更新一条信息
     * @param image 新的图片信息
     * @return
     */
    Integer updateImage(Image image);


}
