package cn.kgc.tangcco.day11.tang;

import cn.kgc.tangcco.day11.tang.base.BaseBankCard;
import cn.kgc.tangcco.day11.tang.bean.MainCard;
import cn.kgc.tangcco.day11.tang.bean.ViceCard;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 李庆华
 * @Description 银行卡管理
 * @date 2020/9/11 9:03
 */
public class Card {
    private static Card instance = new Card();

    public static Card getInstance() {
        return instance;
    }

    /**
     * 储存库
     */
    Map<String, BaseBankCard> cardMap = new HashMap<String,BaseBankCard>();


    {cardMap.put("6222620123456789000",new ViceCard("6222620123456789000",1234,"Tom1",1000));
    cardMap.put("6222620123456789001",new MainCard("6222620123456789001",1234,"Tom2",1000));
    cardMap.put("6222620123456789002",new ViceCard("6222620123456789002",1234,"Tom3",1000));
    }

    /**
     * 显示银行卡信息
     */
    public void check() {

            Collection<BaseBankCard> values = cardMap.values();
            for (BaseBankCard b : values) {
                if (b instanceof MainCard) {
                    System.out.println("卡号" + b.getId() + "\t名字:" + b.getName() + ",本行卡");
                } else if (b instanceof ViceCard) {
                    System.out.println("卡号" + b.getId() + "\t名字:" + b.getName() + ",非本行卡");
                }
            }
        }

    /**
     * 开户
     *
     * @param card 卡信息
     * @return 是否成功
     */
    public boolean activate(BaseBankCard card) {
        if (card != null) {
            cardMap.put(card.getId(), card);
            return true;
        }
        return false;
    }

    /**
     * 删除
     * @param id  卡号
     * @param pwd 密码
     * @return 是否成功
     */
    public boolean delete(String id, int pwd) {
        if (entrance(id,pwd)){
            cardMap.remove(id);
            return true;
        }
        return false;
    }

    /**
     * 登录
     * @param id 卡号
     * @param pwd 密码
     * @return 是否正确
     */
    public boolean entrance(String id, int pwd) {
        Set<String> strings = cardMap.keySet();
        if (id != null) {
            for (String s : strings) {
                if (id.equals(s) && pwd == cardMap.get(id).getPwd()) {
                    return true;
                }
            }
        }
        return false;

    }

    /**
     * 查询key
     *
     * @param id key
     * @return key指定对象
     */
    public BaseBankCard card(String id) {
        Set<String> strings = cardMap.keySet();
        for (String s : strings) {
            if (s.equals(id)) {
                return cardMap.get(id);
            }
        }
        return null;
    }


}
