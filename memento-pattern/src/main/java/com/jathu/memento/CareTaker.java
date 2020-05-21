package com.jathu.memento;

import java.util.Stack;

public class CareTaker {
	
	Stack<Sentence.WordMemento> history = new Stack<Sentence.WordMemento>();
	
	public void save(Sentence sentence) {
		history.push(sentence.save());
	}
	
	public void revert(Sentence sentence) {
		if(!history.isEmpty()) {
			sentence.revert(history.pop());
		} else {
			System.out.println("cannot undo..! ");
		}
	}
}
