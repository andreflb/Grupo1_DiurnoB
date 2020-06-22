package com.istec.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.istec.objectos.Admin;
import com.istec.objectos.Empresa;
import com.istec.objectos.Produto;
import com.istec.objectos.Vendedor;


public class Dados {
	
	public static Dados instance;
	public Empresa emp;
	public Vendedor vend;
	public ArrayList<Produto> produtos;
	public ArrayList<Vendedor> vendedores;
	public Dados() {
		ler();
		lerProd();
		lerVend();
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
	public boolean VendedorRegisto(String username, String email, String pwd, String cfn, String imagemv) 
	{
		
		Vendedor  vend = new Vendedor(username, email, pwd, cfn, imagemv);
		this.vendedores.add(vend);
		
		guardarVend();
		return true;
	}
	
	//VENDAS
	public boolean ProdutoRegisto(String designacao, String codigo, String preco, String Tipo_produto, String imagem) 
	{
		
		Produto  prod = new Produto (designacao, preco, codigo, Tipo_produto, imagem);
		this.produtos.add(prod);
		
		guardarProd();
		return true;
	}
	
	public  void guardarVend() {
		try {
			ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream(new File("Vendedor.dat")));
			objs.writeObject(this.vendedores);
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
			objs.writeObject(this.produtos);
			objs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  boolean lerProd() {
		try {
			ObjectInputStream objs = new ObjectInputStream(new FileInputStream(new File("Produto.dat")));
			ArrayList<Produto> result = (ArrayList<Produto>) objs.readObject();
			this.produtos = result;
			objs.close();
			return true;
		} catch (FileNotFoundException e) {
			this.produtos = new ArrayList<Produto>();
			// TODO Auto-generated catch block
		return false;
		} catch (IOException e) {
			return false;

		} catch (ClassNotFoundException e) {
			return false;

		}
	}
	public  boolean lerVend() {
		try {
			ObjectInputStream objs = new ObjectInputStream(new FileInputStream(new File("Vendedor.dat")));
			ArrayList<Vendedor> result1 = (ArrayList<Vendedor>) objs.readObject();
			this.vendedores = result1;
			objs.close();
			return true;
		} catch (FileNotFoundException e) {
			this.vendedores = new ArrayList<Vendedor>();
			// TODO Auto-generated catch block
		return false;
		} catch (IOException e) {
			return false;

		} catch (ClassNotFoundException e) {
			return false;

		}
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	
}
