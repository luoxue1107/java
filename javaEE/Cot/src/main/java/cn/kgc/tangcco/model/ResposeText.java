package cn.kgc.tangcco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 李昊哲
 * @Description
 * @create 2020/9/5 上午11:58
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ResposeText<T>{
    /**
     * 状态码
     */
    private String code;
    /**
     * 状态码含义
     */
    private String msg;
    /**
     * 数据封装
     */
    private T data;
}
