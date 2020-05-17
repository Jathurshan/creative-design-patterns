package com.jathu.builder;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	private List<Packing> items = new ArrayList<Packing>();

	public void addItem(Packing packs) {
		items.add(packs);
	}

	public void getCost() {
		for (Packing packs : items) {
			packs.price();
		}
	}

	public void showItems() {
		for (Packing pack : items) {
			System.out.println("CD Name: " + pack.pack());
			System.out.println(", Price:" + pack.price());
		}
	}
}
