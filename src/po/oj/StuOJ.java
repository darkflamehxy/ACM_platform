package po.oj;

import po.student.Student;

public class StuOJ {

    private Integer id;
    private String account;
    private String password;

    private Student student; /* 关联关系：该账号对应的学生 */
    private OnlineJudge onlineJudge; /* 关联关系：该账号对应的oj */

    public StuOJ() {
    }

    public StuOJ(Integer id, String account, String password, Student student, OnlineJudge onlineJudge) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.student = student;
        this.onlineJudge = onlineJudge;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public OnlineJudge getOnlineJudge() {
        return onlineJudge;
    }

    public void setOnlineJudge(OnlineJudge onlineJudge) {
        this.onlineJudge = onlineJudge;
    }

    @Override
    public String toString() {
        return "StuOJ{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                //", student=" + student +
                //", onlineJudge=" + onlineJudge +
                '}';
    }
}
