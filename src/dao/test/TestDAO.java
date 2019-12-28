package dao.test;

import dao.BaseHibernateDAO;
import po.test.Test;

import java.util.List;

public class TestDAO extends BaseHibernateDAO implements ITestDAO {
    @Override
    public void save(Test test) {
        getSession().save(test);
    }

    @Override
    public void delete(Test test) {
        getSession().delete(test);
    }

    @Override
    public void update(Test test) {
        getSession().update(test);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
