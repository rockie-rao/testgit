package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_course")
public class Stu implements Serializable{
	@Id
	@GenericGenerator(name="native",strategy="native")
	@GeneratedValue(generator="native")
	private Integer id;
	
	@Column(name="name")
	private String name;

	@Formula(value="(select xx)")
	private long courseCount;
//	@ManyToMany(mappedBy="stus",targetEntity=Course.class)
//	@ManyToOne()
//	@OneToMany()
//	@OneToOne()
//	@OneToMany()
	private Set<Course> courses =  new HashSet<Course>();
	
	public Stu() {
	}

	public Stu(Integer id, String name, Set<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
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

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
}
