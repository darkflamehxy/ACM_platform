package dao.article;

import java.util.List;

import dao.BaseHibernateDAO;
import dao.knowledge.IKnowledgeDAO;
import po.article.Article;
import po.knowledge.Knowledge;

public class ArticleDAO extends BaseHibernateDAO implements IArticleDAO{
	@Override
    public void save(Article article) {
        getSession().save(article);
    }

    @Override
    public void delete(Article article) {
        getSession().delete(article);
    }

    @Override
    public void update(Article article) {
        getSession().update(article);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
