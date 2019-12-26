package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dao.article.IArticleDAO;
import dao.knowledge.IKnowledgeDAO;
import po.article.Article;
import po.knowledge.Knowledge;


public class ArticleDAOTest {

    private Article article;
    
    
    private IArticleDAO dao;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new FileSystemXmlApplicationContext("WebContent/WEB-INF/applicationContext.xml");
        article = (Article) context.getBean("article");
        dao = (IArticleDAO) context.getBean("articleDAO");
    }

    @Test
    public void save() {
        article.setId(2);
        dao.save(article);
    }

    @Test
    public void delete() {
        dao.delete(article);
    }

    @Test
    public void update() {
    	
    	article.setDescription("12");
        dao.update(article);

    }

    @Test
    public void query() {
        String hql = "from Article";
        System.out.println(dao.query(hql));
    }

}