package dao.teacher;

import dao.BaseHibernateDAO;
import po.student.Student;
import po.teacher.Teacher;

import java.util.List;

public class TeacherDAO extends BaseHibernateDAO implements ITeacherDAO {
    @Override
    public void save(Teacher teacher) {
        getSession().save(teacher);
    }

    @Override
    public void delete(Teacher teacher) {
        getSession().delete(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        getSession().update(teacher);
    }

    @Override
    public List query(String hql) {
        return getSession().createQuery(hql).list();
    }
}
