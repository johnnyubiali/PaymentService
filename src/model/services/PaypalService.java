package model.services;

public class PaypalService implements OnlinePaymentService{

	private static final double fee_percentage = 0.02;
	private static final double monthly_interest = 0.01;
	
	@Override
	public double fee(double amount) {
		return amount * fee_percentage;
	}
	
	@Override
	public double interest(double amount, int monthly) {
		return amount * monthly_interest * monthly;
	}
	
	
}
