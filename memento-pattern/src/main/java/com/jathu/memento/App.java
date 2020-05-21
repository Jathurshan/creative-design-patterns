package com.jathu.memento;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Sentence sentence = new Sentence();
		CareTaker careTaker = new CareTaker();
		
		sentence.addWord(new Word("my"));
		System.out.println(sentence);
		
		sentence.addWord(new Word("is"));
		careTaker.save(sentence);
		System.out.println(sentence);
		
		sentence.addWord(new Word("james"));
		careTaker.save(sentence);
		System.out.println(sentence);
		
		sentence.addWord(new Word("bond"));
	
		System.out.println(sentence);
		
		careTaker.revert(sentence);
		System.out.println(sentence);
		
		careTaker.revert(sentence);
		System.out.println(sentence);
		
		careTaker.revert(sentence);
		System.out.println(sentence);
		
		careTaker.revert(sentence);
		System.out.println(sentence);
		
		careTaker.revert(sentence);
		System.out.println(sentence);
	}
}
