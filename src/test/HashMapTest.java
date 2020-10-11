package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.MyHashMap;
import main.MyLinkedHashMap;

public class HashMapTest {

	@Test
	public void returnWordFrequencyFromGivenSentence() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("be");
		System.out.println(myHashMap);
		Assert.assertEquals(2, frequency);
	}


	@Test
	public void returnParanoidFrequencyFromGivenPassage() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they"
							+ " keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.getMap(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.addMap(word, value);
		}
		int frequency = myLinkedHashMap.getMap("paranoid");
		System.out.println(myLinkedHashMap);
		Assert.assertEquals(3, frequency);
	}
	@Test
	public void removeAvoidableFromGivenPassage() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they"
							+ " keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.getMap(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.addMap(word, value);
		}
		int frequency = myLinkedHashMap.getMap("paranoid");
		System.out.println(myLinkedHashMap);
		Assert.assertEquals(3, frequency);
	}
}
	
