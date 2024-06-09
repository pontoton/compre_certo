package br.com.viaweb.appcomprecerto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_seq")
	private Integer num_seq;
	
	@Column(name = "quantidade")
	private Double  quantidade;
	
	@Column(name = "preco_total")
	private Double  preco_total;
	
	@Column(name = "concluido")
	private Integer concluido;
	
	@ManyToOne
	@JoinColumn(name = "tb_produto_id_produto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "tb_lista_id_lista")
	private Lista lista;

	public Integer getNum_seq() {
		return num_seq;
	}

	public void setNum_seq(Integer num_seq) {
		this.num_seq = num_seq;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco_total() {
		return preco_total;
	}

	public void setPreco_total(Double preco_total) {
		this.preco_total = preco_total;
	}

	public Integer getConcluido() {
		return concluido;
	}

	public void setConcluido(Integer concluido) {
		this.concluido = concluido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Lista getLista() {
		return lista;
	}

	public void setLista(Lista lista) {
		this.lista = lista;
	}
	
	
}
