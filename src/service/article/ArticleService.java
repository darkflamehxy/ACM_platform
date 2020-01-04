package service.article;

import dao.article.ArticleDAO;
import dao.article.IArticleDAO;
import po.article.Article;

import java.lang.*;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;

public class ArticleService implements IArticleService{
	private IArticleDAO articleDao = null;

	public IArticleDAO getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(IArticleDAO articleDao) {
		this.articleDao = articleDao;
	}
	
	public void SelectAll() {
		String hql = "from Article";
		List<Article> aList = (List<Article>)articleDao.query(hql);
		System.out.println(aList.size());
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("article_all_s", aList);
	}
	public void SelectOne(Article a) {
		String hql = "from Article where id = " + a.getId();
		List<Article> aList = (List<Article>)articleDao.query(hql);
		Article aa = aList.get(0);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("article_one_s", aa);
	}
}
