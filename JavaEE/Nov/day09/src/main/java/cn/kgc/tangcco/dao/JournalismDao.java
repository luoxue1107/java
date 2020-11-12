package cn.kgc.tangcco.dao;

import cn.kgc.tangcco.pojo.Journalism;

import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 11:50
 */
public interface JournalismDao {
    List<Journalism> selectAllJournalism(Map<String, Object> map);
    Integer insertJournalism( Journalism journalism);
    Integer deleteJournalism(Integer id);
    Integer updateJournalismView(Integer id ,Integer view);
    Journalism selectJournalismById(Integer id);
}
