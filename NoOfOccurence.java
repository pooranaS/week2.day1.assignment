package week2.day1;

public class NoOfOccurence {
	public static void main(String[] args) {
		String str1 = "welcome to chennai";
		char[] arr = str1.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'e') {
				count = count + 1;
			}
		}
		System.out.println("Number of 'e' occurence are:" + count);
}
}
