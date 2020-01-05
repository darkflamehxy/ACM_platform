package action.problem;

import po.problem.Problem;
import service.problem.IProblemService;

public class ProblemAction {
	private Problem problem;
	private IProblemService problemService = null;

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public IProblemService getProblemService() {
		return problemService;
	}

	public void setProblemService(IProblemService problemService) {
		this.problemService = problemService;
	}

	public String all() {
		problemService.SelectAll();
		return "all";
	}

	public String detail() {
		problemService.SelectOne(problem);
		return "detail";
	}
}
