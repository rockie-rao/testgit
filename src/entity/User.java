package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//表示该类是一个实体类 
@Entity
//表示该实体类对应的表是t_user
@Table(name="t_user")
public class User implements Serializable{

	// 属性上的注解可以添加在属性或者对应的get方法上
	// 主键
	@Id
	// 主键生成策略:该主键生成策略是jdk中定义的生成策略，不是hibernate中的生成策略
//	@GeneratedValue(strategy=GenerationType.AUTO)
	// 如果想使用hibernate的主键生成策略
	@GeneratedValue(generator="someGe")
	@GenericGenerator(name="someGe",strategy="native")
	private Integer id;
	
	//表示普通属性，相当于hbm文件中的property,name对应的是列名
	@Column(name="name")
	private String username;
	
	@Column(name="pwd")
	private String password;
	
	@Column(name="age")
	private int age;

	public User() {
		System.out.println("User.User().....................");
	}
	
	
	public User(Integer id, String username, String password, int age) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", age=" + age + "]\n";
	}


	public User(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	
	
}
