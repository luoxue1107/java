package cn.kgc.tangcco.service;

import cn.kgc.tangcco.pojo.Journalism;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/12 8:46
 */
public interface ServiceJournalism {
    Journalism getJournalismById(Integer id);
    Integer setJournalismView(Integer view, Integer id);
}
