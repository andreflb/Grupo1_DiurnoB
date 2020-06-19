package com.istec.objectos;

import java.io.Serializable;


public class Vendedor extends User implements Serializable{
	String email;
	String cfn;
	String imagemv;
	
	public Vendedor(String username, String pwd,String cfn, String email,String imagemv) {
		super(username, pwd);
		this.cfn = cfn;
		this.email = email;
		this.imagemv= imagemv;
		// TODO Auto-generated constructor stub
	}

	public String getImagemv() {
		return imagemv;
	}

	

	public String getEmail() {
		return email;
	}

	public String getCfn() {
		return cfn;
	}	
	
	}
	
	


