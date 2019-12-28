package dao.test;

import dao.BaseHibernateDAO;
import po.test.Test;
import po.test.TestProblem;

import java.util.List;

public class TestProblemDAO extends BaseHibernateDAO implements ITestProblemDAO {
    @Override
    public void save(TestProblem testProblem) {
        getSession().save(testProblem);
    }

    @Override
    public void delete(TestProblem testProblem) {
        getSession().delete(testProblem);
    }

    @Override
    public void update(TestProblem testProblem) {
        getSession().update(testProblem);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
