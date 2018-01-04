package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//映射组件
//@Embeddable
public class Name {
	
//	@Column(name="first_name")
	private String firstName;
	
//	@Column(name="last_name")
	private String lastName;
	
	public Name() {
	}
	

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return lastName + "." +  firstName;
	}
	
}
