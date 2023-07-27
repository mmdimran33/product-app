package crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "User")
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String firstname;
	private String lastname;
	private String username;
	private long mobileno;
	private String password;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int userid, String firstname, String lastname, String username, long mobileno,
			String password) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.mobileno = mobileno;
		this.password = password;
	}


	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserRegistration [userid=" + userid + ", firstname=" + firstname+ ", lastname=" + lastname
				+ ", username=" + username + ", mobileno=" + mobileno + ", password=" + password + "]";
	}
}
