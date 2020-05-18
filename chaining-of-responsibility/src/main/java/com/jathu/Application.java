package com.jathu;

public class Application {

	public static void main(String[] args) {
		UnitsLevel1 unitsLevel1 = new UnitsLevel1();
		UnitsLevel2 unitsLevel2 = new UnitsLevel2();
		UnitsLevel3 unitsLevel3 = new UnitsLevel3();
		TaxAmount taxAmount = new TaxAmount();
		
		taxAmount.setSuccessor(unitsLevel1);
		unitsLevel1.setSuccessor(unitsLevel2);
		unitsLevel2.setSuccessor(unitsLevel3);
		
		Invoice invoice = new Invoice(1, 2975);
		System.out.println("Amount: " + taxAmount.applyTax(invoice));
		
		Invoice invoice2 = new Invoice(2, 1750);
		System.out.println("Amount: " + taxAmount.applyTax(invoice2));
		
		Invoice invoice3 = new Invoice(3, 1400);
		System.out.println("Amount: " + taxAmount.applyTax(invoice3));
	}
}
