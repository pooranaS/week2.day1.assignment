package week2.day1;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String text1="stops";
		String text2="posts";
		
		int text1_length = text1.length();
		int text2_length = text2.length();
		
		if(text1_length != text2_length)
		{
			System.out.println("The given txt are not anagram");
		}
		
		char[] charArr1=text1.toCharArray();
		char[] charArr2=text2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		if(Arrays.equals(charArr1, charArr2))
		{
			System.out.println(text1+" and "+text2+" are anagram");
		}

		else
			System.out.println(text1+" and "+text2+" are not anagram");
	}

}
