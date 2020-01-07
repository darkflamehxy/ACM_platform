package service.knowledge;

import po.knowledge.Knowledge;
import po.problem.Problem;

public interface IKnowledgeService {
	public void SelectAll();

	public void Add(Knowledge knowledge);

	public void SelectNotIn(Problem problem);

}
