package action.article;

import org.omg.CORBA.PUBLIC_MEMBER;

import dao.article.IArticleDAO;
import po.article.Article;
import service.article.IArticleService;

public class ArticleAction {
	private Article article;
	private IArticleService articleService = null;


	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	public IArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(IArticleService articleService) {
		this.articleService = articleService;
	}
	
	public String all() {
		articleService.SelectAll();
		return "all";
	}
	public String detail() {
		articleService.SelectOne(article);
		return "detail";
	}
}
