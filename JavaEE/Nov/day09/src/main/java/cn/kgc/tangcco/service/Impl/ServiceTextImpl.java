package cn.kgc.tangcco.service.Impl;

import cn.kgc.tangcco.dao.Impl.TextDaoImpl;
import cn.kgc.tangcco.pojo.Text;
import cn.kgc.tangcco.service.ServiceText;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/12 2:22
 */
public class ServiceTextImpl implements ServiceText {
    @Override
    public Text getTextByJid(Integer jid) {
      return new TextDaoImpl().selectTextByJid(jid);
    }
}
