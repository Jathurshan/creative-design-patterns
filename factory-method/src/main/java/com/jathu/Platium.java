package com.jathu;

public class Platium extends Package{

	@Override
	protected void createPackage() {
		// TODO Auto-generated method stub
		classRoom.add(new EntertainmentChannel());
		classRoom.add(new SportsChannel());
		classRoom.add(new MovieOnDemand());
	}

}
