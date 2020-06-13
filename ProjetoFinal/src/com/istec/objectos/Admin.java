package com.istec.objectos;

import java.io.Serializable;

public class Admin extends User  implements Serializable{
	
	String cfn;
	String Tipo_vendedor;

	public Admin(String username, String pwd, String cfn, String Tipo_vendedor) {
		super(username, pwd);
		this.cfn = cfn;
		this.Tipo_vendedor = Tipo_vendedor;
	}
	
	

}
