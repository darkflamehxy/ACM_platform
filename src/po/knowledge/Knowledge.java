package po.knowledge;

import po.article.Article;
import po.problem.Problem;

import java.util.Set;

public class Knowledge {
    private Integer id;
    private String name;
    private String description;
    private Integer level;

    private Knowledge preKno; /* 关联关系：前置知识点（误删） */

    /* 关联关系：该知识点上的所有文章
     * 级联关系：1、all-delete-orphan
     *           2、删除知识点，级联删除Articles表和ArtKnos表
     *           3、（更新/删除/添加）文章：使用知识点类的setArticles方法，可以（更新/删除/添加）文章
     * 已测试
     * */
    private Set<Article> articles;

    /* 关联关系：知识点的所有题目（误删）
     * 级联关系：1、save-update
     *           2、删除知识点，级联删除ProKnos表，但不影响Problems表
     *           3、（更新/删除/添加）题目：使用知识点类的setProblems方法，可以（更新/删除/添加）题目
     * 已测试
     * */
    private Set<Problem> problems;

    public Knowledge() {
    }

    public Knowledge(Integer id, String name, String description, Integer level, Knowledge preKno, Set<Article> articles, Set<Problem> problems) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.level = level;
        this.preKno = preKno;
        this.articles = articles;
        this.problems = problems;
    }

    public Knowledge getPreKno() {
        return preKno;
    }

    public void setPreKno(Knowledge preKno) {
        this.preKno = preKno;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Set<Problem> getProblems() {
        return problems;
    }

    public void setProblems(Set<Problem> problems) {
        this.problems = problems;
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                //", preKno=" + preKno +
                //", articles=" + articles +
                //", problems=" + problems +
                '}';
    }
}
