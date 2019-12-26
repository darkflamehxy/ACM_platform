package dao.article;

import java.util.List;

import po.article.ArticleKnoledge;

public interface IArticleKnoledgeDAO {
	void save(ArticleKnoledge articleKnoledge);//增

    void delete(ArticleKnoledge articleKnoledge);//删

    void update(ArticleKnoledge articleKnoledge);//改

    List query(String hql);//查
}
