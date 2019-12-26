package dao.article;

import java.util.List;

import po.article.Article;

public interface IArticleDAO {
	void save(Article article);//增

    void delete(Article article);//删

    void update(Article article);//改

    List query(String hql);//查
}
