package springmvc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {
	private String id, title;
	private Integer minSal;

	public Job() {
	}

	public Job(String id, String title) {
		this.id = id;
		this.title = title;
	}

	@Id
	@Column(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "minsal")
	public Integer getMinSal() {
		return minSal;
	}

	public void setMinSal(Integer minSal) {
		this.minSal = minSal;
	}
}
