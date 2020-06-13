package com.istec.objectos;

import java.io.Serializable;

public class Produto implements Serializable{
		
		String designacao;
		String preco;
		String codigo;
		String Tipo_produto;
		
		public Produto(String designacao, String preco, String codigo, String Tipo_produto) {
			super();
			this.designacao = designacao;
			this.preco = preco;
			this.codigo = codigo;
		}

		public String getDesignacao() {
			return designacao;
		}

		public String getPreco() {
			return preco;
		}

		public String getCodigo() {
			return codigo;
		}	
		
		public String getTipo_produto() {
			return Tipo_produto;
		}

}
