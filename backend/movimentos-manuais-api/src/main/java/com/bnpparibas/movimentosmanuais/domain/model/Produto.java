package com.bnpparibas.movimentosmanuais.domain.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="PRODUTO")
public class Produto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_PRODUTO")
	
	
	private String codigoProduto;
	
	@Column(name = "DES_PRODUTO")
	private String descricacaoProduto;
	
	@Column(name = "STA_STATUS")
	private String status;
	
	@OneToMany(mappedBy = "produto")
	private List<ProdutoCosif> produtos;

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricacaoProduto() {
		return descricacaoProduto;
	}

	public void setDescricacaoProduto(String descricacaoProduto) {
		this.descricacaoProduto = descricacaoProduto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ProdutoCosif> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoCosif> produtos) {
		this.produtos = produtos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoProduto, descricacaoProduto, produtos, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigoProduto, other.codigoProduto)
				&& Objects.equals(descricacaoProduto, other.descricacaoProduto)
				&& Objects.equals(produtos, other.produtos) && Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", descricacaoProduto=" + descricacaoProduto + ", status="
				+ status + ", produtos=" + produtos + "]";
	}

	
}