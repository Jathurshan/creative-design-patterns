package com.jathu.prototype_pattern;

public abstract class Entertainment implements Cloneable {
	
	protected String channelName;
	abstract void addChannel();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
