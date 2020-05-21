package com.jathu.memento;
//originator

import java.util.ArrayList;

public class Sentence {
	ArrayList<Word> wordItem = new ArrayList<Word>();

	public void addWord(Word word) {
		wordItem.add(word);
	}

	public ArrayList<Word> getWordItem() {
		return (ArrayList<Word>) wordItem.clone();
	}

	public WordMemento save() {
		return new WordMemento(getWordItem());
	}

	public void revert(WordMemento wordMemento) {
		wordItem = wordMemento.getWordItem();
	}

	@Override
	public String toString() {
		return "Sentence [wordItem=" + wordItem + "]";
	}

	static class WordMemento {
		ArrayList<Word> wordItem;

		public WordMemento(ArrayList<Word> wordItem) {
			this.wordItem = wordItem;
		}

		private ArrayList<Word> getWordItem() {
			return wordItem;
		}

	}

}
