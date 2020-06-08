package com.istec.objectos;

import java.io.Serializable;

public class User  implements Serializable{
	String username; 
	String pwd;
	
	public User(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}

	public String getUsername() {
		return username;
	}

	public String getPwd() {
		return pwd;
	}
	

}
