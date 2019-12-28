package dao.test;

import po.test.Test;

import java.util.List;

public interface ITestDAO {
    void save(Test test);//增

    void delete(Test test);//删

    void update(Test test);//改

    List query(String hql);//查

}
