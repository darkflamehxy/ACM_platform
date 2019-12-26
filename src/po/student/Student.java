package po.student;

import java.util.Date;
import java.util.Set;

import po.article.Article;
import sun.print.resources.serviceui;

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
	
	private Set<Article> articles;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer id, String account, String password, String name,
			Date birthday, Integer sex, String email, String phone, String school,
			String major, Integer score, Set<Article> articles) {
		this.id = id;
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public Set<Article> getArticles() {
		return articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
}
