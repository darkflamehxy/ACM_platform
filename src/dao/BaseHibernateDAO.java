package dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseHibernateDAO {
    //定义SessionFactory对象
    private SessionFactory sessionFactory;
    //SessionFactory对象的setter方法
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //使用SessionFactory对象获取session
    public Session getSession(){
        return sessionFactory.getCurrentSession();
        //return sessionFactory.openSession();
    }
}
