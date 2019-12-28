package dao.oj;

import dao.BaseHibernateDAO;
import po.oj.StuOJ;

import java.util.List;

public class StuOJDAO extends BaseHibernateDAO implements IStuOJDAO {
    @Override
    public void save(StuOJ stuOJ) {
        getSession().save(stuOJ);
    }

    @Override
    public void delete(StuOJ stuOJ) {
        getSession().delete(stuOJ);
    }

    @Override
    public void update(StuOJ stuOJ) {
        getSession().update(stuOJ);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
