package com.istec.objectos;

import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable {
	String company;
	int vat;
	Admin admin;
	
	ArrayList<Vendedor> Vendedores;

	public Empresa(String company, int vat, Admin admin) {
		super();
		this.company = company;
		this.vat = vat;
		this.admin = admin;
	}

	public String getCompany() {
		return company;
	}

	public int getVat() {
		return vat;
	}

	public Admin getAdmin() {
		return admin;
	}
	

}
