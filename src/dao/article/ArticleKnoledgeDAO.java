package dao.article;

import java.util.List;

import dao.BaseHibernateDAO;
import po.article.ArticleKnowledge;

public class ArticleKnoledgeDAO  extends BaseHibernateDAO implements IArticleKnoledgeDAO {
	@Override
    public void save(ArticleKnowledge articleKnowledge) {
        getSession().save(articleKnowledge);
    }

    @Override
    public void delete(ArticleKnowledge articleKnowledge) {
        getSession().delete(articleKnowledge);
    }

    @Override
    public void update(ArticleKnowledge articleKnowledge) {
        getSession().update(articleKnowledge);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
