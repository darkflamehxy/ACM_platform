package service.article;

import po.article.Article;

public interface IArticleService {
	public void SelectAll();
	public void SelectOne(Article a);
}
