package action.problem;

import po.problem.Problem;
import po.problem.StuPro;
import po.student.Student;
import service.problem.IStuProService;

public class StuProAction {
	private StuPro stupro;
	private Student student;
	private Problem problem;
	private IStuProService stuproService = null;

	public String all() {
		stuproService.SelectAll();
		return "all";
	}

	public String detail() {
		stuproService.SelectOne(stupro);
		return "detail";
	}

	public String acpro() {
		stuproService.SelectACPro(stupro);
		return "acpro";
	}

	public String acstu() {
		stuproService.SelectACStu(stupro);
		return "acstu";
	}

	public StuPro getStupro() {
		return stupro;
	}

	public void setStupro(StuPro stupro) {
		this.stupro = stupro;
	}

	public IStuProService getStuproservice() {
		return stuproService;
	}

	public void setStuproservice(IStuProService stuproservice) {
		this.stuproService = stuproservice;
	}

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
