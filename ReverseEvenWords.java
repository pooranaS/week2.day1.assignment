package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test="I am a software tester";
		String[] words=test.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			if(i%2==1)
			{
				StringBuilder sb = new StringBuilder(words[i]);
				words[i]=sb.reverse().toString();
				System.out.println("even words:"+words[i]);
				
			}
			else
				System.out.println("odd words:"+words[i]);
		}

	}

}
