package service.problem;

import po.problem.Problem;

public interface IProblemService {
	public void save(Problem p);

	public void delete(Problem p);

	public void update(Problem p);

	public void SelectAll();

	public void SelectOne(Problem p);

}
