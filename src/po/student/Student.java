package po.student;

import po.article.Article;
import po.oj.StuOJ;
import po.problem.StuPro;

import java.util.Date;
import java.util.Set;

public class Student {
    private Integer id;
    private String account;
    private String password;
    private String name;
    private Date birthday;
    private Integer sex;
    private String email;
    private String phone;
    private String school;
    private String major;
    private Integer score;

    /* 关联关系：该学生写的文章
     * 级联关系：1、all-delete-orphan
     *           2、删除学生：删除学生后级联删除Articles表
     *           3、（更新/删除/添加）文章：使用学生类的setArticles方法，可以（更新/删除/添加）文章
     * 已测试
     * */
    private Set<Article> articles;

    /* 关联关系：该学生ac的题目（误删）
     * 级联关系：1、all-delete-orphan
     *           2、删除学生：删除学生后级联删除StuPros表，但不影响Problems表
     *           3、（删除/添加）做题记录：使用学生类的setProblems方法，可以（删除/添加）做题记录
     * 已测试
     * */
    private Set<StuPro> stuPros;

    /* 关联关系：该学生oj账号（误删）
     * 级联关系：1、all-delete-orphan
     *           2、删除学生：删除学生后级联删除StuOJs表，但不影响OnlineJudge表
     *           3、（更新/删除/添加）OJ账号：使用学生类的setStuOJs方法，可以（更新/删除/添加）OJ账号
     * 已测试
     * */
    private Set<StuOJ> stuOJs;

    public Student() {
    }

    public Student(Integer id, String account, String password, String name, Date birthday, Integer sex, String email, String phone, String school, String major, Integer score, Set<Article> articles, Set<StuPro> stuPros, Set<StuOJ> stuOJs) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.school = school;
        this.major = major;
        this.score = score;
        this.articles = articles;
        this.stuPros = stuPros;
        this.stuOJs = stuOJs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    public Set<StuPro> getStuPros() {
        return stuPros;
    }

    public void setStuPros(Set<StuPro> stuPros) {
        this.stuPros = stuPros;
    }

    public Set<StuOJ> getStuOJs() {
        return stuOJs;
    }

    public void setStuOJs(Set<StuOJ> stuOJs) {
        this.stuOJs = stuOJs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", score=" + score +
                //", articles=" + articles +
                //", stuPros=" + stuPros +
                //", stuOJs=" + stuOJs +
                '}';
    }
}
