package com.jathu;

public class UnitsLevel2 extends Handler {

	@Override
	public double applyTax(Invoice invoice) {
		// TODO Auto-generated method stub
		invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.02);

		System.out.println("electric bill calculated for level2");

		if (invoice.getAmount() >= 1500 && invoice.getAmount() < 2500) {
			return invoice.getTax();
		} else {
			return successor.applyTax(invoice);
		}
	}

}
