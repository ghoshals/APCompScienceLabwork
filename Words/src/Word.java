//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
   
   //add an instance variable
   
   private String word;
	//create a constructor
	
   public Word(String w) {
		word = w;
	}
	//create other methods
	//look at the sample runner code
	//on the lab handout
	
   public int getNumVowels() {
		int vowelCount = 0;
		
		for (int i = 0; 
i < word.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				char c = word.charAt(i);
				if (c == vowels.charAt(j)) {
					vowelCount = vowelCount + 1;
				}
			}
		}
		return vowelCount;
	}
	
	public int getLength() {
		String wrd = word;
		char[] characters = wrd.toCharArray();
		
		int length = characters.length;
		return length;
		
	}
	
	public void setWord(String wrd) {
		word = wrd;
	}
	
	//create a toString method
	public String toString() {
		String out = word;
		return out;
	}
}