package dao.knowledge;

import java.util.List;

import dao.BaseHibernateDAO;
import po.knowledge.Knowledge;

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
		System.out.println("DAO里面知识点对应的题目数量" + knowledge.getProblems().size());
		getSession().update(knowledge);
	}

	@Override
	public List query(String hql) {
		return getSession().createQuery(hql).list();
	}
}