package exercise;

import java.util.Scanner;

public class Practice {
	 public static void main(String[] args) {
		 int i = 0;
		 String string = "Four score and seven years ago our fathers brought forth on this continent, a new nation, \r\n"
		 		+ "conceived in Liberty, and dedicated to the proposition that all men are created equal.\r\n"
		 		+ "\r\n"
		 		+ "Now we are engaged in a great civil war, testing whether that nation, or any nation so \r\n"
		 		+ "conceived and dedicated, can long endure. We are met on a great battle-field of that war. \r\n"
		 		+ "We have come to dedicate a portion of that field, as a final resting place for those who here gave their \r\n"
		 		+ "lives that that nation might live. It is altogether fitting and proper that we should do this.\r\n"
		 		+ "\r\n"
		 		+ "But, in a larger sense, we can not dedicate -- we can not consecrate -- we can not hallow -- this ground. \r\n"
		 		+ "The brave men, living and dead, who struggled here, have consecrated it, far above our poor power to add or detract. \r\n"
		 		+ "The world will little note, nor long remember what we say here, but it can never forget what they did here. \r\n"
		 		+ "It is for us the living, rather, to be dedicated here to the unfinished work which they who fought here have thus \r\n"
		 		+ "far so nobly advanced. It is rather for us to be here dedicated to the great task remaining before us -- that from these \r\n"
		 		+ "honored dead we take increased devotion to that cause for which they gave the last full measure of devotion -- that \r\n"
		 		+ "we here highly resolve that these dead shall not have died in vain -- that this nation, under God, shall have a new \r\n"
		 		+ "birth of freedom -- and that government of the people, by the people, for the people, shall not perish from the earth. ";
		 
		 for(char c : string.toCharArray()) {
			 i += 1;
		 }
		 System.out.print(i);
	}

}
