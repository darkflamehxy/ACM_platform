package dao.student;

import po.student.Student;

import java.util.List;

public interface IStudentDAO {
    void save(Student student);//增

    void delete(Student student);//删

    void update(Student student);//改

    List query(String hql);//查

}
