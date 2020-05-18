package com.jathu;

public class UnitsLevel3 extends Handler {

	@Override
	public double applyTax(Invoice invoice) {

		invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.05);
		System.out.println("electric bill calculated for level3");

		if (invoice.getAmount() >= 2500 && invoice.getAmount() < 5000) {
			return invoice.getTax();
		} else {
			return successor.applyTax(invoice);
		}
	}

}
