package com.jathu;

public class UnitsLevel1 extends Handler{

	@Override
	public double applyTax(Invoice invoice) {
		// TODO Auto-generated method stub
		invoice.setTax(invoice.getAmount() * 0.01);
		System.out.println("electric bill calculated for level1");
		
		if(invoice.getAmount()<1500) {
			return invoice.getTax();
		} else {
			return successor.applyTax(invoice);
		}
		
	}

}
