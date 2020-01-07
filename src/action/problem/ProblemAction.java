package action.problem;

import po.knowledge.Knowledge;
import po.problem.Problem;
import po.student.Student;
import service.knowledge.IKnowledgeService;
import service.problem.IProblemService;

public class ProblemAction {
	private Student student;
	private Problem problem;
	private Knowledge knowledge;
	private IProblemService problemService = null;
	private IKnowledgeService knowledgeService = null;

	public String save() {
		problemService.save(problem);
		return "teaall";
	}

	public String update() {
		problemService.update(problem);
		return "teaall";
	}

	public String delete() {
		problemService.delete(problem);
		return "teaall";
	}

	public String stuall() {
		problemService.SelectAll();
		return "stuall";
	}

	public String teaall() {
		problemService.SelectAll();
		return "teaall";
	}

	public String stucontest() {
		problemService.SelectAll();
		return "stucontest";
	}

	public String teacontest() {
		problemService.SelectAll();
		return "teacontest";
	}

	public String studetail() {
		problemService.SelectOne(problem);
		return "studetail";
	}

	public String teadetail() {
		problemService.SelectOne(problem);
		knowledgeService.SelectNotIn(problem);
		return "teadetail";
	}

	public String preparekno() {
		problemService.SelectOne(problem);
		problemService.SelectAll();
		return "knoready";
	}

	public String addKno() {
		problemService.addKno(problem, knowledge);
		return "knoadd";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

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

	public IKnowledgeService getKnowledgeService() {
		return knowledgeService;
	}

	public void setKnowledgeService(IKnowledgeService knowledgeService) {
		this.knowledgeService = knowledgeService;
	}

	public Knowledge getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(Knowledge knowledge) {
		this.knowledge = knowledge;
	}

}
