package po.article;

import po.knowledge.Knowledge;
import po.student.Student;

import java.util.Date;
import java.util.Set;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date time;
    private String pic;
    private String description;
    private String type;

    private Student writer; /* 关联关系：作者 */
    private Set<Knowledge> knowledge; /* 关联关系：对应知识点（误删） */

    public Article() {
    }

    public Article(Integer id, String title, String content, Date time, String pic, String description, String type, Student writer, Set<Knowledge> knowledge) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
        this.pic = pic;
        this.description = description;
        this.type = type;
        this.writer = writer;
        this.knowledge = knowledge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Student getWriter() {
        return writer;
    }

    public void setWriter(Student writer) {
        this.writer = writer;
    }

    public Set<Knowledge> getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Set<Knowledge> knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", pic='" + pic + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                //", writer=" + writer +
                //", knowledge=" + knowledge +
                '}';
    }
}
