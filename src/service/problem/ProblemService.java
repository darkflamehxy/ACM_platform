package service.problem;

import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;

import dao.knowledge.IKnowledgeDAO;
import dao.problem.IProblemDAO;
import po.knowledge.Knowledge;
import po.problem.Problem;

public class ProblemService implements IProblemService {
	private IProblemDAO problemDao = null;
	private IKnowledgeDAO knowledgeDao = null;

	public void SelectAll() {
		String hql = "from Problem";
		List<Problem> aList = (List<Problem>) problemDao.query(hql);
		System.out.println(aList.size());
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("problem_all_s", aList);

	}

	public void SelectOne(Problem p) {
		String hql = "from Problem where id = " + p.getId();
		List<Problem> pList = (List<Problem>) problemDao.query(hql);
		Problem pp = pList.get(0);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("problem_one_s", pp);
	}

	public void save(Problem p) {
		problemDao.save(p);
		String hql = "from Problem";
		List<Problem> aList = (List<Problem>) problemDao.query(hql);
		System.out.println(aList.size());
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("problem_all_s", aList);
	}

	public void delete(Problem p) {
		problemDao.delete(p);
		String hql = "from Problem";
		List<Problem> aList = (List<Problem>) problemDao.query(hql);
		System.out.println(aList.size());
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("problem_all_s", aList);
	}

	public void update(Problem p) {
		String hql1 = "from Problem where id = " + p.getId();
		List<Problem> p1List = (List<Problem>) problemDao.query(hql1);
		Problem pp = p1List.get(0);
		p.setKnowledge(pp.getKnowledge());
		problemDao.update(p);
		String hql = "from Problem";
		List<Problem> aList = (List<Problem>) problemDao.query(hql);
		System.out.println(aList.size());
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("problem_all_s", aList);
	}

	public void addKno(Problem problem, Knowledge k) {
		String hql1 = "from Problem where id = " + problem.getId();
		List<Problem> p1List = (List<Problem>) problemDao.query(hql1);
		Problem pp = p1List.get(0);
		Set<Knowledge> set = pp.getKnowledge();
		String hql2 = "from Knowledge where id = " + k.getId();
		List<Knowledge> k1List = (List<Knowledge>) knowledgeDao.query(hql2);
		Knowledge kk = k1List.get(0);
		set.add(kk);
		pp.setKnowledge(set);
		System.out.println("更新前size" + pp.getKnowledge().size());
		problemDao.update(pp);
		String hql = "from Problem where id = " + problem.getId();
		List<Problem> pList = (List<Problem>) problemDao.query(hql);
		pp = pList.get(0);
		System.out.println("更新后size" + pp.getKnowledge().size());
		SelectAll();
	}

	public IProblemDAO getProblemDao() {
		return problemDao;
	}

	public void setProblemDao(IProblemDAO problemDao) {
		this.problemDao = problemDao;
	}

	public IKnowledgeDAO getKnowledgeDao() {
		return knowledgeDao;
	}

	public void setKnowledgeDao(IKnowledgeDAO knowledgeDao) {
		this.knowledgeDao = knowledgeDao;
	}

}
