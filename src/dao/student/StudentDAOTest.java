package dao.student;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import po.article.Article;
import po.oj.StuOJ;
import po.problem.StuPro;
import po.student.Student;

import java.util.Set;

public class StudentDAOTest {

    private String hql = "from Student";
    private Student student;
    private IStudentDAO dao;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new FileSystemXmlApplicationContext("WebContent/WEB-INF/applicationContext.xml");
        student = (Student) context.getBean("student");
        dao = (IStudentDAO) context.getBean("studentDAO");
    }

    @Test
    public void save() {
        student.setMajor("计算机科学与技术");
        dao.save(student);
    }

    @Test
    public void delete() {
        /* 先要通过id获得po类bean */
        student = (Student) dao.query("from Student where id=" + student.getId()).get(0);
        dao.delete(student);
    }

    @Test
    public void update() {
        /* 首先通过学生ID获取实体bean */
        student = (Student) dao.query("from Student where id=" + student.getId()).get(0);

        /* （更新/删除/添加）文章 */
        Set<Article> articles = student.getArticles();
        for (Article article : articles) {
            article.setTitle("1"); // 1、更新文章
            /*if(...){
                articles.remove(article); // 2、删除文章
                break; // 迭代器中remove后break
            }*/

        }
        articles.add(new Article(/*...*/)); // 3、添加文章

        /* （删除/添加）做题记录 */
        Set<StuPro> stuPros = student.getStuPros();
        for (StuPro stuPro : stuPros) {
            /*if (...){
                stuPros.remove(stuPro); // 1、删除做题记录
                break; // 迭代器中remove后break
            }*/
        }
        //stuPros.add(new StuPro(/*...*/)); // 2、添加做题记录

        /* （更新/删除/添加）OJ账号 */
        Set<StuOJ> stuOJs = student.getStuOJs();
        for (StuOJ stuOJ : stuOJs) {
            stuOJ.setPassword("123"); // 1、更新OJ账号
            /*if (...){
                stuOJs.remove(stuOJ); // 2、删除OJ账号
                break; // 迭代器中remove后break
            }*/
        }
        //stuOJs.add(new StuOJ(/*...*/)); // 2、添加OJ账号

        dao.update(student);
    }

    @Test
    public void query() {
        System.out.println(dao.query(hql));
    }
}