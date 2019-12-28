package dao.problem;

import dao.BaseHibernateDAO;
import po.oj.OnlineJudge;
import po.problem.Problem;

import java.util.List;

public class ProblemDAO extends BaseHibernateDAO implements IProblemDAO {
    @Override
    public void save(Problem problem) {
        getSession().save(problem);
    }

    @Override
    public void delete(Problem problem) {
        getSession().delete(problem);
    }

    @Override
    public void update(Problem problem) {
        getSession().update(problem);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
