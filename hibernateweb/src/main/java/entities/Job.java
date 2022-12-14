package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {
	@Id
	private String id;
	@Column
	private String title;
	
	@Column (name = "minsal")
	private Integer minSal;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getMinSal() {
		return minSal;
	}

	public void setMinSal(Integer minSal) {
		this.minSal = minSal;
	}
}
