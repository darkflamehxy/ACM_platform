package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dao.knowledge.IKnowledgeDAO;
import po.knowledge.Knowledge;


public class KnowledgeDAOTest {

    private Knowledge knowledge;
    
    
    private IKnowledgeDAO dao;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new FileSystemXmlApplicationContext("WebContent/WEB-INF/applicationContext.xml");
        knowledge = (Knowledge) context.getBean("knowledge");
        dao = (IKnowledgeDAO) context.getBean("knowledgeDAO");
    }

    @Test
    public void save() {
        knowledge.setId(2);
        dao.save(knowledge);
    }

    @Test
    public void delete() {
        dao.delete(knowledge);
    }

    @Test
    public void update() {
        knowledge.setDescription("12");
        dao.update(knowledge);
    }

    @Test
    public void query() {
        String hql = "from Knowledge";
        System.out.println(dao.query(hql));
    }

}