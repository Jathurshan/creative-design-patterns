package com.jathu;

public class PackageFactory {

	public static Package createPackage(PackageCode packageCode) {
		switch (packageCode) {
		case SILVER:
			return new Silver();
		case GOLD:
			return new Gold();
		case PLATIUM:
			return new Platium();
		default:
			return null;
		}
	}
}
