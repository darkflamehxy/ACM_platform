package po.problem;

import po.student.Student;

public class StuPro {
    private Integer id;

    private Student student;
    private Problem problem;

    public StuPro() {
    }

    public StuPro(Integer id, Student student, Problem problem) {
        this.id = id;
        this.student = student;
        this.problem = problem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        return "StuPro{" +
                "id=" + id +
                ", student=" + student +
                ", problem=" + problem +
                '}';
    }
}
