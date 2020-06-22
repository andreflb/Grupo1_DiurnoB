package com.istec.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.istec.objectos.Admin;
import com.istec.objectos.Empresa;
import com.istec.objectos.Produto;
import com.istec.objectos.Vendedor;


public class Dados {
	
	public static Dados instance;
	public Empresa emp;	
	public Vendedor vd;	
	public Produto pd;	
	public Dados() {
		ler();
	}
	
	public static Dados getinstance() {
		if (instance == null) {
			instance = new Dados();
			return instance;
		}
		return instance;
	}
	
	//REGISTO
	public boolean Registo(String company, int vat, String username, String email, String pwd, String cfn,
			String Tipo_vendedor) {
		
		Admin  ad = new Admin(username,pwd, cfn, Tipo_vendedor);
		Empresa emp = new Empresa(company, vat, ad);
		this.emp = emp;
	
		guardar();
		return true;
	}
	
	//LOGIN
	public boolean login(String username, String pwd) {
		if (this.emp != null) {
			if (this.emp.getAdmin().getUsername().equals(username) && this.emp.getAdmin().getPwd().equals(pwd)) {
				return true;
			}
		}
		return false;
	}
	
	public  void guardar() {
		try {
			ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream(new File("Empresa.dat")));
			objs.writeObject(emp);
			objs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  boolean ler() {
		try {
			ObjectInputStream objs = new ObjectInputStream(new FileInputStream(new File("Empresa.dat")));
			Empresa result = (Empresa) objs.readObject();
			this.emp = result;
			objs.close();
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		return false;
		} catch (IOException e) {
			return false;

		} catch (ClassNotFoundException e) {
			return false;

		}
	}
	
	//VENDEDOR
	public boolean VendedorRegisto(String username, String email, String pwd, String cfn) 
	{
		
		Vendedor  vend = new Vendedor(username, email, pwd, cfn);
		this.vd = vend;
		
		guardar();
		return true;
	}
	
	//VENDAS
	public boolean ProdutoRegisto(String designacao, String codigo, String preco, String Tipo_produto) 
	{
		
		Produto  prod = new Produto (designacao, preco, codigo, Tipo_produto);
		this.pd = prod;
		
		guardar();
		return true;
	}
	
	public  void guardarVend() {
		try {
			ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream(new File("Vendedor.dat")));
			objs.writeObject(vd);
			objs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void guardarProd() {
		try {
			ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream(new File("Produto.dat")));
			objs.writeObject(vd);
			objs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
