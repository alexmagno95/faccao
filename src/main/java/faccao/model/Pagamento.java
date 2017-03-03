package faccao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="pagamento")
public class Pagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Integer totalHoras;
	private Double valorTotal;
	
	
	public Pagamento(){}
	
	public Pagamento(Integer totalHoras) {
		super();
		this.totalHoras = totalHoras;
		this.valorTotal = valorTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(Integer totalHoras) {
		this.totalHoras = totalHoras;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
