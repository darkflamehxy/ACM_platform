package dao.knowledge;

import po.knowledge.Knowledge;

import java.util.List;

public interface IKnowledgeDAO {

    void save(Knowledge knowledge);//增

    void delete(Knowledge knowledge);//删

    void update(Knowledge knowledge);//改

    List query(String hql);//查
}