package po.teacher;

import po.test.Test;

import java.util.Date;
import java.util.Set;

public class Teacher {
    private Integer id;
    private String account;
    private String password;
    private String name;
    private Date birthday;
    private Integer sex;
    private String school;
    private String phone;
    private String email;

    /* 关联关系：该老师发布的测试
     * 级联关系：1、all-delete-orphan
     *           2、删除老师：删除学生后级联删除Tests表和TesPros表
     *           3、（更新/删除/添加）测试：使用学生类的setTests方法，可以（更新/删除/添加）测试
     * 已测试
     * */
    private Set<Test> tests;

    public Teacher() {
    }

    public Teacher(Integer id, String account, String password, String name, Date birthday, Integer sex, String school, String phone, String email, Set<Test> tests) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
        this.phone = phone;
        this.email = email;
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", school='" + school + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", tests=" + tests +
                '}';
    }

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
