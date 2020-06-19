package com.istec.objectos;

import java.io.Serializable;


public class Vendedor extends User implements Serializable{
	String email;
	String cfn;
	
	public Vendedor(String username, String pwd,String cfn, String email) {
		super(username, pwd);
		this.cfn = cfn;
		this.email = email;
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public String getCfn() {
		return cfn;
	}	
	
	}
	
	


