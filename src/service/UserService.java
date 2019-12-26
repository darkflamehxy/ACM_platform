package service;

import dao.student.IStudentDAO;
import dao.student.StudentDAO;
import po.student.*;

public class UserService implements IUserService {
	private IStudentDAO studentDAO = null;

	public UserService() {
	}

	public void setStudentDAO(IStudentDAO studentDAO) {
		System.out.println("--setCustomerDAO--");
		this.studentDAO = studentDAO;
	}

	public void login(Student transientInstance) {
		StudentDAO.check(transientInstance);
	}
}