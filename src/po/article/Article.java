package po.article;

import java.util.Date;
import java.util.Set;

import po.knowledge.Knowledge;
import po.student.Student;

public class Article {
	private Integer id;
    private String title;
    private String content;
    private Date time;
    private String pic;
    private String description;
    private String type;
    
    private Student writer;
    
    public Article() {
    }

    public Article(Integer id, String title, Date time, String pic, String description, Student writer, String type) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.setTime(time);
        this.setPic(pic);
        this.setWriter(writer);
        this.setType(type);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

    @Override
    public String toString() {
        return "Knowledge{" +
                "title=" + title +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}
