package week2.day1;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "madam";
		String rev="";
		
		for(int i=(str.length())-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		System.out.println("The given "+str+" is palindrome");
		else
		System.out.println("The given "+str+" is not palindrome");
	}

}
