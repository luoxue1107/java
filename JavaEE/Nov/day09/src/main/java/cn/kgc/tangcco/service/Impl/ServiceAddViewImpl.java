package cn.kgc.tangcco.service.Impl;

import cn.kgc.tangcco.dao.Impl.JournalismDaoImpl;
import cn.kgc.tangcco.service.ServiceAddView;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/12 13:06
 */
public class ServiceAddViewImpl implements ServiceAddView {
    @Override
    public Integer addView(Integer view, Integer id) {
        return new JournalismDaoImpl().updateJournalismView(view, id);
    }
}
