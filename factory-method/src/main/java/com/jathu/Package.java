package com.jathu;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {
	protected List<Channels> classRoom = new ArrayList<Channels>();

	public Package() {
		createPackage();
	}

	protected abstract void createPackage();

	@Override
	public String toString() {
		return "Package [classRoom=" + classRoom + "]";
	}

}
