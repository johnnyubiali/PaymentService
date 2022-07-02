package model.entities;

import java.util.Date;

public class Contract {

	private Integer Number;
	private Date date;
	private Double totalValue;
	
	private Installment installment;
	
	public Contract() {
	}

	public Contract(Integer number, Date date, Double totalValue, Installment installment) {
		Number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installment = installment;
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

	public Installment getInstallment() {
		return installment;
	}

	public void setInstallment(Installment installment) {
		this.installment = installment;
	}
	
	
	
	
}
