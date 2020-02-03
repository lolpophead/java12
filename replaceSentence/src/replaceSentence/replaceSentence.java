package replaceSentence;

import java.util.Scanner;

public class replaceSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String sentence;
		String word;
		//creates two string  for the user inputed sentence and word
		
		System.out.println("pls enter sentence");
		sentence = input.nextLine();
		//prompts the user to input a sentence and assigns it to the variable sentence
		
		System.out.println("pls enter word");
		word = input.nextLine();
		//prompts the user to input a word to be deleted and assigns it to the variable word
		
		sentence = sentence.replaceAll(word,"");
		//replaces the word associated with the string word with a blank space
		
		sentence = sentence.replaceAll("  "," ");
		//replaces double spaces occurring before and after a deleted word with a single space
		
		sentence = sentence.trim();
		//trims spaces that may have be created before the sentence is the first word was deleted
		
		System.out.println(sentence);
		//prints out the modified sentence
		
		
	}
		
	}


