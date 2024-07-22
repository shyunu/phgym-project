package com.phgym.admin.model;
import java.time.LocalDateTime;

public class UserAccountDTO {

	private int userNo;
	private String userId;
	private String userPw;
	private String userName;
	private LocalDateTime userBirth;
	private String userGender;
	private String userPhone;
	private String userEmail; 
	private String userAddress;
	private LocalDateTime userRegDate;
	private String userProfile;
	
	public UserAccountDTO() {
		
	}
	
	
	public UserAccountDTO(int userNo, String userId, String userPw, String userName, LocalDateTime userBirth,
			String userGender, String userPhone, String userEmail, String userAddress, LocalDateTime userRegDate,
			String userProfile) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userBirth = userBirth;
		this.userGender = userGender;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userRegDate = userRegDate;
		this.userProfile = userProfile;
	}


	public int getUserNo() {
		return userNo;
	}


	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPw() {
		return userPw;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public LocalDateTime getUserBirth() {
		return userBirth;
	}


	public void setUserBirth(LocalDateTime userBirth) {
		this.userBirth = userBirth;
	}


	public String getUserGender() {
		return userGender;
	}


	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}


	public String getUserPhone() {
		return userPhone;
	}


	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}


	public LocalDateTime getUserRegDate() {
		return userRegDate;
	}


	public void setUserRegDate(LocalDateTime userRegDate) {
		this.userRegDate = userRegDate;
	}


	public String getUserProfile() {
		return userProfile;
	}


	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
	
	
	
	
}