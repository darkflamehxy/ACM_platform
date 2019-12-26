package dao.knowledge;

import po.knowledge.PreKnowledge;

import java.util.List;

public interface IPreKnowledgeDAO {

    void save(PreKnowledge preKnowledge);//增

    void delete(PreKnowledge preKnowledge);//删

    void update(PreKnowledge preKnowledge);//改

    List query(String hql);//查
}