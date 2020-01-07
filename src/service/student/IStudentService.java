package service.student;

import po.student.Student;

public interface IStudentService {
	public boolean stuRegister(Student transientInstance);
	public boolean stuDelete(Student transientInstance);
	public boolean stuUpdate(Student transientInstance);
	public boolean stuLogin(Student transientInstance);
}
