package service.problem;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import dao.problem.IStuProDAO;
import po.problem.Problem;
import po.problem.StuPro;
import po.student.Student;

public class StuProService implements IStuProService {
	private IStuProDAO stuproDao = null;

	public void SelectAll() {
		String hql = "from StuPro";
		List<StuPro> spList = (List<StuPro>) stuproDao.query(hql);
		System.out.println(spList.size());
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("stupro_all_s", spList);
	}

	public void SelectByStu(Student s) {
		String hql = "from StuPro where Student.id = " + s.getId();
		List<StuPro> spList = (List<StuPro>) stuproDao.query(hql);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("stupro_bystudent_s", spList);
	}

	public void SelectByPro(Problem p) {
		String hql = "from StuPro where Problem.id = " + p.getId();
		List<StuPro> spList = (List<StuPro>) stuproDao.query(hql);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("stupro_byproblem_s", spList);
	}

	public void SelectOne(StuPro sp) {
		String hql = "from StuPro where id = " + sp.getId();
		List<StuPro> spList = (List<StuPro>) stuproDao.query(hql);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("stupro_one_s", spList);
	}
}
