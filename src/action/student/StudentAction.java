package action.student;

import com.opensymphony.xwork2.ActionSupport;

import po.student.Student;
import service.student.IStudentService;

public class StudentAction extends ActionSupport {

	private Student loginUser;
	private IStudentService stuService = null;

	public Student getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(Student loginUser) {
		this.loginUser = loginUser;
	}

	public IStudentService getStudentService() {
		return stuService;
	}

	public void setStudentService(IStudentService stuService) {
		this.stuService = stuService;
	}

	public String stuRegister() {
		if (stuService.stuRegister(loginUser)) {
			this.addActionMessage("ע��ɹ�������ҳ������ǰ����¼");
			return "success";
		} else {
			this.addActionError("ע��ʧ�ܣ��û����ظ���");
			return "fail";
		}
	}

	public String stuLogin() {
		if (stuService.stuLogin(loginUser)) {
			return "success";
		} else {
			this.addActionError("�û������������");
			return "fail";
		}
	}

	public String stuUpdate() {
		if (stuService.stuUpdate(loginUser)) {
			this.addActionMessage("���³ɹ��������µ�¼��");
			return "success";
		} else {
			this.addActionError("����ʧ�ܣ������ԣ�");
			return "fail";
		}
	}

	public String stuDelete() {
		if (stuService.stuDelete(loginUser)) {
			this.addActionMessage("ע���ɹ���");
			return "success";
		} else {
			this.addActionError("ע��ʧ�ܣ������ԣ�");
			return "fail";
		}
	}
}
