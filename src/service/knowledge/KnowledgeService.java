package service.knowledge;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import dao.knowledge.IKnowledgeDAO;
import dao.problem.IProblemDAO;
import po.knowledge.Knowledge;
import po.problem.Problem;

public class KnowledgeService implements IKnowledgeService {
	private IKnowledgeDAO knowledgeDao = null;
	private IProblemDAO problemDao = null;

	public IKnowledgeDAO getKnowledgeDao() {
		return knowledgeDao;
	}

	public void setKnowledgeDao(IKnowledgeDAO knowledgeDao) {
		this.knowledgeDao = knowledgeDao;
	}

	public void SelectAll() {
		String hql = "from Knowledge";
		List<Knowledge> kList = (List<Knowledge>) knowledgeDao.query(hql);
		String tmp = dfs(kList.get(0), kList);
		System.out.println(tmp);
		try {
			String url = ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/")
					+ "tree.json";
			System.out.println(url);
			File file = new File(url);
			if (file.exists()) { // 如果已存在,删除旧文件
				file.delete();
			}
			file.createNewFile();
			Writer write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
			write.write(tmp);
			write.flush();
			write.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("knowledge_all_s", kList);
	}

	public void SelectNotIn(Problem p) {
		String hql = "from Knowledge";
		List<Knowledge> kList = (List<Knowledge>) knowledgeDao.query(hql);
		String tmp = dfs(kList.get(0), kList);
		System.out.println(tmp);
		try {
			String url = ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/")
					+ "tree.json";
			System.out.println(url);
			File file = new File(url);
			if (file.exists()) { // 如果已存在,删除旧文件
				file.delete();
			}
			file.createNewFile();
			Writer write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
			write.write(tmp);
			write.flush();
			write.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String hql2 = "from Problem where id = " + p.getId();
		List<Problem> pList = (List<Problem>) problemDao.query(hql2);
		Problem pp = pList.get(0);
		List<Knowledge> res = new ArrayList<Knowledge>();
		for (Knowledge i : kList) {
			boolean flag = true;
			for (Knowledge j : pp.getKnowledge()) {
				if (i.getId().equals(j.getId())) {
					flag = false;
				}
			}
			if (flag) {
				res.add(i);
			}
		}
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("knowledge_not_in_s", res);
	}

	public void Add(Knowledge knowledge) {
		knowledgeDao.save(knowledge);
		String hql = "from Knowledge";
		List<Knowledge> kList = (List<Knowledge>) knowledgeDao.query(hql);
		String tmp = dfs(kList.get(0), kList);
		System.out.println(tmp);
		try {
			String url = ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/")
					+ "tree.json";
			System.out.println(url);
			File file = new File(url);
			if (file.exists()) { // 如果已存在,删除旧文件
				file.delete();
			}
			file.createNewFile();
			Writer write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
			write.write(tmp);
			write.flush();
			write.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("knowledge_all_s", kList);
	}

	public String dfs(Knowledge root, List<Knowledge> kList) {
		String res = "{\"name\":\"";
		res += root.getName().trim();
		res += "\"";
		int cnt = 0;
		for (int i = 0; i < kList.size(); ++i) {
			if (kList.get(i).getPreKno() == null)
				continue;
			if (kList.get(i).getPreKno().getId() == root.getId())
				cnt++;
		}
		if (cnt == 0) {
			res += "}";
			return res;
		}
		res += ",\"children\":[";
		for (int i = 0; i < kList.size(); ++i) {
			if (kList.get(i).getPreKno() == null)
				continue;
			if (kList.get(i).getPreKno().getId() == root.getId()) {
				res += dfs(kList.get(i), kList);
				cnt--;
				if (cnt > 0)
					res += ",";
			}
		}
		res += "]}";
		return res;
	}

	public IProblemDAO getProblemDao() {
		return problemDao;
	}

	public void setProblemDao(IProblemDAO problemDao) {
		this.problemDao = problemDao;
	}

}
