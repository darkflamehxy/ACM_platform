package dao.article;

import java.util.List;

import dao.BaseHibernateDAO;
import po.article.Article;
import po.article.ArticleKnoledge;

public class ArticleKnoledgeDAO  extends BaseHibernateDAO implements IArticleKnoledgeDAO {
	@Override
    public void save(ArticleKnoledge articleKnoledge) {
        getSession().save(articleKnoledge);
    }

    @Override
    public void delete(ArticleKnoledge articleKnoledge) {
        getSession().delete(articleKnoledge);
    }

    @Override
    public void update(ArticleKnoledge articleKnoledge) {
        getSession().update(articleKnoledge);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
