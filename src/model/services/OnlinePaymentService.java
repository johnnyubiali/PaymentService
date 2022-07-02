package model.services;

public interface OnlinePaymentService {

	double fee(double amount);
	double interest(double amount, int monthly);
}
