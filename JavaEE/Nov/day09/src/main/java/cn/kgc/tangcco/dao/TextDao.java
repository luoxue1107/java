package cn.kgc.tangcco.dao;

import cn.kgc.tangcco.pojo.Text;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/12 2:01
 */
public interface TextDao {
    Text selectTextByJid(Integer jid);
}
