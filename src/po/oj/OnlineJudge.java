package po.oj;

import po.problem.Problem;

import java.util.Set;

public class OnlineJudge {
    private Integer id;
    private String name;
    private String url;

    /* 关联关系：该oj上的所有题目（误删）
     * 级联关系：1、save-update
     *           2、（更新/删除/添加）oj题目：使用oj类的setProblems方法，可以（更新/删除/添加）oj题目
     * 已测试
     * */
    private Set<Problem> problems;

    /* 关联关系：该oj上的所有账号（误删）
     * 级联关系：1、all-delete-orphan
     *           2、删除oj后，级联删除StuOJs，但不影响Student
     *           3、（和学生类的stuOJs属性一样可用，但可忽略）（更新/删除/添加）oj账号：使用oj类的setStuOJs方法，可以（更新/删除/添加）oj账号
     * 已测试
     * */
    private Set<StuOJ> stuOJs;

    public OnlineJudge() {
    }

    public OnlineJudge(Integer id, String name, String url, Set<Problem> problems, Set<StuOJ> stuOJs) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.problems = problems;
        this.stuOJs = stuOJs;
    }

    public Set<StuOJ> getStuOJs() {
        return stuOJs;
    }

    public void setStuOJs(Set<StuOJ> stuOJs) {
        this.stuOJs = stuOJs;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<Problem> getProblems() {
        return problems;
    }

    public void setProblems(Set<Problem> problems) {
        this.problems = problems;
    }

    @Override
    public String toString() {
        return "OnlineJudge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", problems=" + problems +
                ", stuOJs=" + stuOJs +
                '}';
    }
}
