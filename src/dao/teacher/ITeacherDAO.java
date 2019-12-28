package dao.teacher;

import po.teacher.Teacher;

import java.util.List;

public interface ITeacherDAO {
    void save(Teacher teacher);//增

    void delete(Teacher teacher);//删

    void update(Teacher teacher);//改

    List query(String hql);//查

}
