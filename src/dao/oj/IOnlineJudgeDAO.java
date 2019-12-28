package dao.oj;

import po.oj.OnlineJudge;

import java.util.List;

public interface IOnlineJudgeDAO {
    void save(OnlineJudge onlineJudge);//增

    void delete(OnlineJudge onlineJudge);//删

    void update(OnlineJudge onlineJudge);//改

    List query(String hql);//查

}
