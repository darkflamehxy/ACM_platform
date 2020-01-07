package service.problem;

import java.util.ArrayList;
import java.util.LinkedHashSet;
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

	public void SelectACPro(StuPro sp) {
		String hql = "from StuPro where student.id = " + sp.getStudent().getId();
		List<StuPro> spList = (List<StuPro>) stuproDao.query(hql);
		List<Problem> pList = new ArrayList<Problem>();
		for (StuPro sp1 : spList) {
			pList.add(sp1.getProblem());
		}
		LinkedHashSet<Problem> hashSet = new LinkedHashSet<Problem>(pList);
		List<Problem> pListWithoutDuplicates = new ArrayList<Problem>(hashSet);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("acpro_s", pListWithoutDuplicates);
	}

	public void SelectACStu(StuPro sp) {
		String hql = "from StuPro where problem.id = " + sp.getProblem().getId();
		List<StuPro> spList = (List<StuPro>) stuproDao.query(hql);
		List<Student> sList = new ArrayList<Student>();
		for (StuPro sp1 : spList) {
			sList.add(sp1.getStudent());
		}
		LinkedHashSet<Student> hashSet = new LinkedHashSet<Student>(sList);
		List<Student> sListWithoutDuplicates = new ArrayList<Student>(hashSet);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("acstu_s", sListWithoutDuplicates);
	}

	public void SelectOne(StuPro sp) {
		String hql = "from StuPro where id = " + sp.getId();
		List<StuPro> spList = (List<StuPro>) stuproDao.query(hql);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("stupro_one_s", spList);
	}

	public IStuProDAO getStuproDao() {
		return stuproDao;
	}

	public void setStuproDao(IStuProDAO stuproDao) {
		this.stuproDao = stuproDao;
	}

	public void save(StuPro sp) {
		stuproDao.save(sp);
	}

}
