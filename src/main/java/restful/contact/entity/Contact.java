package restful.contact.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity

public class Contact implements Serializable{
	@Id
	private String student_id;
	@Column
	private String name;
	@Column
	private String clas;
	@Column 
	private String phone;
	@Column
	private String email;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String student_id, String name, String clas, String phone, String email) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.clas = clas;
		this.phone = phone;
		this.email = email;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString(){
		return "{ student_id= " + student_id +
				", name=" + name + 
				", class=" + clas +
				", phone=" + phone +
				", email=" + email +
				"}";
	}
}
