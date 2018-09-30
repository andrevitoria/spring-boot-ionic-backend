package com.andrevitoria.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.andrevitoria.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
@Entity
@JsonTypeName("pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataVencimento;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataPagamento;
	public PagamentoComBoleto () {}
	public PagamentoComBoleto(Integer id, EstadoPagamento pagamento, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, pagamento, pedido);
		// TODO Auto-generated constructor stub
		this.dataVencimento = dataVencimento;
		this.dataPagamento  = dataPagamento;
		
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
