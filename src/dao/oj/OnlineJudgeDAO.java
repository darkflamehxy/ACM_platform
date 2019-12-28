package dao.oj;

import dao.BaseHibernateDAO;
import po.oj.OnlineJudge;

import java.util.List;

public class OnlineJudgeDAO extends BaseHibernateDAO implements IOnlineJudgeDAO {
    @Override
    public void save(OnlineJudge onlineJudge) {
        getSession().save(onlineJudge);
    }

    @Override
    public void delete(OnlineJudge onlineJudge) {
        getSession().delete(onlineJudge);
    }

    @Override
    public void update(OnlineJudge onlineJudge) {
        getSession().update(onlineJudge);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
