package dao.problem;

import po.problem.StuPro;

import java.util.List;

public interface IStuProDAO {
    void save(StuPro stuPro);//增

    void delete(StuPro stuPro);//删

    void update(StuPro stuPro);//改

    List query(String hql);//查

}
