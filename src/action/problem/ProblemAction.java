package action.problem;

import po.problem.Problem;
import po.student.Student;
import service.problem.IProblemService;

public class ProblemAction {
	private Student student;
	private Problem problem;
	private IProblemService problemService = null;

	public String save() {
		problemService.save(problem);
		return "teaall";
	}

	public String update() {
		problemService.update(problem);
		return "teaall";
	}

	public String delete() {
		System.out.println("action删除action删除action删除action删除action删除action删除action删除action删除");
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
		return "teadetail";
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
}
