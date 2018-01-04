package entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;

public class Person {

	private Integer id;
	
	private Integer age;
	
	@Embedded
	@AttributeOverrides(value={
		@AttributeOverride(name="firstName",column=@Column(name="first_name")),
		@AttributeOverride(name="lastName",column=@Column(name="last_name"))
	})
	private Name name;
	
	public Person() {
	}
	
	public Person(Integer id, Integer age, Name name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	
	
	
}
