package service.problem;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import dao.problem.IProblemDAO;
import po.problem.Problem;

public class ProblemService implements IProblemService {
	private IProblemDAO problemDao = null;

	public void SelectAll() {
		String hql = "from Problems";
		List<Problem> aList = (List<Problem>) problemDao.query(hql);
		System.out.println(aList.size());
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("problem_all_s", aList);

	}

	public void SelectOne(Problem b) {
		String hql = "from Problems where id = " + b.getId();
		List<Problem> aList = (List<Problem>) problemDao.query(hql);
		Problem bb = aList.get(0);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("problem_one_s", bb);

	}

	public IProblemDAO getProblemDao() {
		return problemDao;
	}

	public void setProblemDao(IProblemDAO problemDao) {
		this.problemDao = problemDao;
	}

}
