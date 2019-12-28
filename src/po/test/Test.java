package po.test;

import po.problem.Problem;
import po.teacher.Teacher;

import java.util.Date;
import java.util.Set;

public class Test {
    private Integer id;
    private String name;
    private Date beginTime;
    private Date endTime;
    private String description;

    private Teacher host; /* 关联关系：比赛发起者 */
    /* 关联关系：该测试上的所有题目
     * 级联关系：1、all-delete-orphan
     *           2、删除学生：删除学生后级联删除TesPros表，但不影响Problems表
     *           3、（更新/删除/添加）测试题目：使用学生类的setProblems方法，可以（更新/删除/添加）测试题目
     * 已测试
     * */
    private Set<Problem> problems;

    public Test() {
    }

    public Test(Integer id, String name, Teacher host, Date beginTime, Date endTime, String description, Set<Problem> problems) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.description = description;
        this.problems = problems;
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

    public Teacher getHost() {
        return host;
    }

    public void setHost(Teacher host) {
        this.host = host;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Problem> getProblems() {
        return problems;
    }

    public void setProblems(Set<Problem> problems) {
        this.problems = problems;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", host=" + host +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", description='" + description + '\'' +
                ", problems=" + problems +
                '}';
    }
}
