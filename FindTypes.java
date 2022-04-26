package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0,space = 0,digit = 0, specialChar = 0;
		 
		char[] charArr=test.toCharArray();
		
		for(int i=0;i<charArr.length;i++)
		{
			if(Character.isLetter(charArr[i]))
			{
				letter++;
			}
			else if (Character.isSpaceChar(charArr[i]))
			{
				space++;
			}
			else if(Character.isDigit(charArr[i]))
			{
				digit++;
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("The number of occurence of letter is: "+letter);
		System.out.println("The number of occurence of space is: "+space);
		System.out.println("The number of occurence of numbers is: "+digit);
		System.out.println("The number of occurence of special chars is: "+specialChar);
	}

}
