package service.problem;

import po.problem.StuPro;

public interface IStuProService {
	public void save(StuPro sp);

	public void SelectAll();

	public void SelectACPro(StuPro sp);

	public void SelectACStu(StuPro sp);

	public void SelectOne(StuPro sp);
}
