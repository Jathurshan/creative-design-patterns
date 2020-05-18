package com.jathu;

public class Invoice {

	private int invoiceNumber;
	private double amount;
	private double tax;

	protected void setTax(double tax) {
		this.tax = tax;
	}

	public Invoice(int invoiceNumber, double amount) {
		// TODO Auto-generated constructor stub
		this.invoiceNumber = invoiceNumber;
		this.amount = amount;
		this.tax = tax;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public double getAmount() {
		return amount;
	}

	public double getTax() {
		return tax;
	}

}
