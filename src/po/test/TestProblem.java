package po.test;

import po.problem.Problem;

public class TestProblem {
    private Integer id;

    private Test test;
    private Problem problem;

    public TestProblem() {
    }

    public TestProblem(Integer id, Test test, Problem problem) {
        this.id = id;
        this.test = test;
        this.problem = problem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        return "TestProblem{" +
                "id=" + id +
                ", test=" + test +
                ", problem=" + problem +
                '}';
    }
}
