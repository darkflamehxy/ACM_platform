package dao.article;

import java.util.List;

import po.article.ArticleKnowledge;

public interface IArticleKnoledgeDAO {
	void save(ArticleKnowledge articleKnowledge);//增

    void delete(ArticleKnowledge articleKnowledge);//删

    void update(ArticleKnowledge articleKnowledge);//改

    List query(String hql);//查
}
