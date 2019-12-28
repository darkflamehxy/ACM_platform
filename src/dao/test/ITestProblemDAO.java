package dao.test;

import po.test.TestProblem;

import java.util.List;

public interface ITestProblemDAO {
    void save(TestProblem testProblem);//增

    void delete(TestProblem testProblem);//删

    void update(TestProblem testProblem);//改

    List query(String hql);//查

}
