package dao.problem;

import dao.BaseHibernateDAO;
import po.problem.StuPro;

import java.util.List;

public class StuProDAO extends BaseHibernateDAO implements IStuProDAO {
    @Override
    public void save(StuPro stuPro) {
        getSession().save(stuPro);
    }

    @Override
    public void delete(StuPro stuPro) {
        getSession().delete(stuPro);
    }

    @Override
    public void update(StuPro stuPro) {
        getSession().update(stuPro);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
