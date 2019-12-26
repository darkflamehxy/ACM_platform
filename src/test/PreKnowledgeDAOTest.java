package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dao.knowledge.IPreKnowledgeDAO;
import po.knowledge.Knowledge;
import po.knowledge.PreKnowledge;

import static org.junit.Assert.*;

public class PreKnowledgeDAOTest {

    private Knowledge knowledge;
    private PreKnowledge preKnowledge;
    private IPreKnowledgeDAO dao;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new FileSystemXmlApplicationContext("WebContent/WEB-INF/applicationContext.xml");
        knowledge = (Knowledge) context.getBean("knowledge");
        preKnowledge = (PreKnowledge) context.getBean("preKnowledge");
        dao = (IPreKnowledgeDAO) context.getBean("preKnowledgeDAO");
    }

    @Test
    public void save() {
        knowledge.setId(2);
        preKnowledge.setPreKnow(knowledge);
        dao.save(preKnowledge);
    }

    @Test
    public void delete() {
        dao.delete(preKnowledge);
    }

    @Test
    public void update() {
        preKnowledge.setId(2);
        preKnowledge.setPreKnow(knowledge);
        dao.update(preKnowledge);

    }

    @Test
    public void query() {
        String hql = "from PreKnowledge";
        System.out.println(dao.query(hql));
    }

}