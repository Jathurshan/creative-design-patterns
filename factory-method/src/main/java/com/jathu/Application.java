package com.jathu;

public class Application {
	public static void main(String [] args) {
		
		Package packageSelect = PackageFactory.createPackage(PackageCode.SILVER);
		System.out.println(packageSelect);
		
		Package packageSelected2 = PackageFactory.createPackage(PackageCode.GOLD);
		System.out.println(packageSelected2);
		
		Package packageSelected3 = PackageFactory.createPackage(PackageCode.PLATIUM);
		System.out.println(packageSelected3);
	}
}
