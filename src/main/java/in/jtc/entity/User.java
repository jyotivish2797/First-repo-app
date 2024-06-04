package in.jtc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="user_file")

public class User {
	
	@Id
	@Column(name="Id")
	private Integer uId;
	@Column(name="name")
	private String userName;
	@Column(name="gender")
	private String userGender;
	@Column(name="age")
	private Integer userAge;
	@Column(name="cname")
	private String userCountry;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer uId, String userName, String userGender, Integer userAge, String userCountry) {
		super();
		this.uId = uId;
		this.userName = userName;
		this.userGender = userGender;
		this.userAge = userAge;
		this.userCountry = userCountry;
	}

	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", userName=" + userName + ", userGender=" + userGender + ", userAge=" + userAge
				+ ", userCountry=" + userCountry + "]";
	}
	
}
