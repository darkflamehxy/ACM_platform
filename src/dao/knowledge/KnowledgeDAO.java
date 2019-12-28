package dao.knowledge;

import dao.BaseHibernateDAO;
import po.knowledge.Knowledge;

import java.util.List;

public class KnowledgeDAO extends BaseHibernateDAO implements IKnowledgeDAO {
    @Override
    public void save(Knowledge knowledge) {
        getSession().save(knowledge);

    }

    @Override
    public void delete(Knowledge knowledge) {
        getSession().delete(knowledge);
    }

    @Override
    public void update(Knowledge knowledge) {
        getSession().update(knowledge);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}