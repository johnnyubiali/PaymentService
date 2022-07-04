package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer Number;
	private Date date;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contract() {
	}

	public Contract(Integer number, Date date, Double totalValue) {
		super();
		Number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return Number;
	}

	public void setNumber(Integer number) {
		Number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallment(Installment installment) {
		installments.add(installment);
	}

	public void removeInstallment(Installment installment) {
		installments.remove(installment);
	}
	
	
	
}
