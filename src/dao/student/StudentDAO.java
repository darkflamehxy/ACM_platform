package dao.student;

import dao.BaseHibernateDAO;
import po.student.Student;

import java.util.List;

public class StudentDAO extends BaseHibernateDAO implements IStudentDAO {
    @Override
    public void save(Student student) {
        getSession().save(student);
    }

    @Override
    public void delete(Student student) {
        getSession().delete(student);
    }

    @Override
    public void update(Student student) {
        getSession().update(student);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
