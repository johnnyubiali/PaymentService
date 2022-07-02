package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		super();
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i = 1; i<=months; i++) {
			Date date = addMonths(contract.getDate(), months);
			double updateQuota = onlinePaymentService.interest(basicQuota, months);
			double fullQuota = onlinePaymentService.fee(updateQuota);
			contract.addInstallment(new Installment(date, fullQuota));
		}
		
	}
	
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
