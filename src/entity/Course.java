package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;

public class Course implements Serializable{
	private Integer id;
	
	private String name;
	
	private Set<Stu> stus =  new HashSet<Stu>();
	
	public Course() {
	}

	public Course(Integer id, String name, Set<Stu> stus) {
		super();
		this.id = id;
		this.name = name;
		this.stus = stus;
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

	public Set<Stu> getStus() {
		return stus;
	}

	public void setStus(Set<Stu> stus) {
		this.stus = stus;
	}
	
}
