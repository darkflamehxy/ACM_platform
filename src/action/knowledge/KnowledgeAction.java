package action.knowledge;

import po.knowledge.Knowledge;
import service.knowledge.IKnowledgeService;

public class KnowledgeAction {
	private Knowledge knowledge;
	private IKnowledgeService knowledgeService = null;

	public Knowledge getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(Knowledge knowledge) {
		this.knowledge = knowledge;
	}
	

	public IKnowledgeService getKnowledgeService() {
		return knowledgeService;
	}

	public void setKnowledgeService(IKnowledgeService knowledgeService) {
		this.knowledgeService = knowledgeService;
	}
	
	public String all() {
		knowledgeService.SelectAll();
		return "all";
	}
	
	public String allt() {
		knowledgeService.SelectAll();
		return "allt";
	}
	
	public String addpre() {
		knowledgeService.SelectAll();
		return "addpre";
	}
	
	public String add() {
		knowledgeService.Add(knowledge);
		return "add";
	}
}
