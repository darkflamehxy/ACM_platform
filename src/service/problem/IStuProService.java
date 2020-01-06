package service.problem;

import po.problem.Problem;
import po.problem.StuPro;
import po.student.Student;

public interface IStuProService {
	public void SelectAll();

	public void SelectByStu(Student s);

	public void SelectByPro(Problem p);

	public void SelectOne(StuPro sp);
}
