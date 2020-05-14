package com.jathu.prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class ChannelStore {
	private static Map<String, Entertainment> channelMap = new HashMap<String, Entertainment>();

	static {
		channelMap.put("Sun TV", new SunNetworkChannels());
		channelMap.put("Star Vijay", new StarNetworkChannels());
		channelMap.put("Colors TV", new ColorsNetworkChannels());
	}
	
	public static Entertainment getEntertainment(String channelName) {
		try {
			return (Entertainment) channelMap.get(channelName).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
