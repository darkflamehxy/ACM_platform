package dao.knowledge;

import dao.BaseHibernateDAO;
import po.knowledge.PreKnowledge;

import java.util.List;

public class PreKnowledgeDAO extends BaseHibernateDAO implements IPreKnowledgeDAO {
    @Override
    public void save(PreKnowledge preKnowledge) {
        getSession().save(preKnowledge);
    }

    @Override
    public void delete(PreKnowledge preKnowledge) {
        getSession().delete(preKnowledge);
    }

    @Override
    public void update(PreKnowledge preKnowledge) {
        getSession().update(preKnowledge);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}