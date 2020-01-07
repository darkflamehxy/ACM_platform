package po.problem;

import java.util.HashSet;
import java.util.Set;

import po.knowledge.Knowledge;
import po.oj.OnlineJudge;

public class Problem {
	private Integer id;
	private String name;
	private String description;
	private String input;
	private String output;
	private String sampleInput;
	private String sampleOutput;
	private Integer level;
	private String answer;
	private String proID;

	private OnlineJudge onlineJudge; /* 关联关系：题目对应oj（误删） */
	private Set<Knowledge> knowledge = new HashSet(); /* 关联关系：题目对应的知识点（误删） */

	public Problem() {
	}

	public Problem(Integer id, String name, String description, String input, String output, String sampleInput,
			String sampleOutput, Integer level, String answer, String proID, OnlineJudge onlineJudge,
			Set<Knowledge> knowledge) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.input = input;
		this.output = output;
		this.sampleInput = sampleInput;
		this.sampleOutput = sampleOutput;
		this.level = level;
		this.answer = answer;
		this.proID = proID;
		this.onlineJudge = onlineJudge;
		this.knowledge = knowledge;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getSampleInput() {
		return sampleInput;
	}

	public void setSampleInput(String sampleInput) {
		this.sampleInput = sampleInput;
	}

	public String getSampleOutput() {
		return sampleOutput;
	}

	public void setSampleOutput(String sampleOutput) {
		this.sampleOutput = sampleOutput;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public OnlineJudge getOnlineJudge() {
		return onlineJudge;
	}

	public void setOnlineJudge(OnlineJudge onlineJudge) {
		this.onlineJudge = onlineJudge;
	}

	public String getProID() {
		return proID;
	}

	public void setProID(String proID) {
		this.proID = proID;
	}

	public Set<Knowledge> getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(Set<Knowledge> knowledge) {
		this.knowledge = knowledge;
	}

	@Override
	public String toString() {
		return "Problem{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", input='"
				+ input + '\'' + ", output='" + output + '\'' + ", sampleInput='" + sampleInput + '\''
				+ ", sampleOutput='" + sampleOutput + '\'' + ", level=" + level + ", answer='" + answer + '\''
				+ ", proID='" + proID + '\'' +
				// ", onlineJudge=" + onlineJudge +
				// ", knowledge=" + knowledge +
				'}';
	}
}
