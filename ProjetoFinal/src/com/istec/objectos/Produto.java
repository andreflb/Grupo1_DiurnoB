package com.istec.objectos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Produto implements Serializable{
		
		String designacao;
		String preco;
		String codigo;
		String Tipo_produto;
		String imagem;
		
		public Produto(String designacao, String preco, String codigo, String Tipo_produto, String imagem) {
			super();
			this.designacao = designacao;
			this.preco = preco;
			this.codigo = codigo;
			this.imagem = imagem;
			this.Tipo_produto = Tipo_produto;
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

		public String getImagem() {
			return imagem;
		}
		
}
