package dao.problem;

import po.problem.Problem;

import java.util.List;

public interface IProblemDAO {
    void save(Problem problem);//增

    void delete(Problem problem);//删

    void update(Problem problem);//改

    List query(String hql);//查

}
