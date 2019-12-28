package dao.oj;

import po.oj.StuOJ;

import java.util.List;

public interface IStuOJDAO {
    void save(StuOJ stuOJ);//增

    void delete(StuOJ stuOJ);//删

    void update(StuOJ stuOJ);//改

    List query(String hql);//查

}
