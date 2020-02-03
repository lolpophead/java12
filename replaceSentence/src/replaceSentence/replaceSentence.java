package replaceSentence;

import java.util.Scanner;

public class replaceSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String sentence;
		String word;
		
		System.out.println("pls enter sentence");
		sentence = input.nextLine();
		System.out.println("pls enter word");
		word = input.nextLine();
		
		sentence = sentence.replaceAll(word,"");
		sentence = sentence.replaceAll("  "," ");
		sentence = sentence.trim();
		
		
		
		System.out.println(sentence);
		
		
	}
		
	}


