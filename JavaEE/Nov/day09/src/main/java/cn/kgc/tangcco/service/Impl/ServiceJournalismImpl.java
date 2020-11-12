package cn.kgc.tangcco.service.Impl;

import cn.kgc.tangcco.dao.Impl.JournalismDaoImpl;
import cn.kgc.tangcco.pojo.Journalism;
import cn.kgc.tangcco.service.ServiceJournalism;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/12 8:46
 */
public class ServiceJournalismImpl implements ServiceJournalism {
    @Override
    public Journalism getJournalismById(Integer id) {
        return  new JournalismDaoImpl().selectJournalismById(id);
    }

    @Override
    public Integer setJournalismView(Integer view, Integer id) {
        return new JournalismDaoImpl().updateJournalismView(view, id);
    }
}
