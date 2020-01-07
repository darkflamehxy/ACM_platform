package service.student;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import dao.student.IStudentDAO;
import po.student.Student;
import service.student.IStudentService;

public class StudentService implements IStudentService{

	private IStudentDAO studentDAO = null;
	private Map<String, Object> session;
	public IStudentDAO getStudentDAO() {
		return studentDAO;
	}
	public void setStudentDAO(IStudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	@Override
	public boolean stuLogin(Student stu) {
		System.out.println("excute --stuLogin()-- method.");
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		String account = stu.getAccount();
		String password = stu.getPassword();
		String hql = "from Student as stu where stu.account='"
		+account+ "' and stu.password='" + password +"'";
		List list = studentDAO.query(hql);
		if(list.isEmpty())
			return false;
		else {
			stu=(Student)list.get(0);
			session.put("student_s",stu);
			return true;
		}
	}
	
	@Override
	public boolean stuRegister(Student stu) {
		// TODO Auto-generated method stub
		System.out.println("excute --stuRegister()-- method.");
		try {
			studentDAO.save(stu);
			return true;
		}catch(Exception e){
			System.out.println(e);
			return false;
		}		
	}

	@Override
	public boolean stuDelete(Student stu) {
		// TODO Auto-generated method stub
		System.out.println("excute --stuDelete()-- method.");
        try {
            Student student = (Student) studentDAO.query("from Student where id=" + stu.getId()).get(0);
            studentDAO.delete(student);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
	}

	@Override
	public boolean stuUpdate(Student stu) {
		// TODO Auto-generated method stub
		System.out.println("excute --stuUpdate()-- method.");
		try {
			studentDAO.update(stu);
			return true;
		}catch(Exception e){
			System.out.println(e);
			return false;
		}
	}

}
