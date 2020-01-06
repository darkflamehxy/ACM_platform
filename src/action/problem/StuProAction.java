package action.problem;

import po.problem.Problem;
import po.problem.StuPro;
import po.student.Student;
import service.problem.IStuProService;

public class StuProAction {
	private StuPro stupro;
	private Student student;
	private Problem problem;
	private IStuProService stuproservice = null;

	public StuPro getStupro() {
		return stupro;
	}

	public void setStupro(StuPro stupro) {
		this.stupro = stupro;
	}

	public IStuProService getStuproservice() {
		return stuproservice;
	}

	public void setStuproservice(IStuProService stuproservice) {
		this.stuproservice = stuproservice;
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

	public String all() {
		stuproservice.SelectAll();
		return "all";
	}

	public String detail() {
		stuproservice.SelectOne(stupro);
		return "detail";
	}

	public String byStu() {
		stuproservice.SelectByStu(student);
		return "byStu";
	}

	public String byPro() {
		stuproservice.SelectByPro(problem);
		return "byPro";
	}
}
