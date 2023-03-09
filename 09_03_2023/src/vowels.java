import java.util.*;
public class vowels {

	public static void main(String[] args) {
		String str;
		System.out.print("Enter a string to find the vowels : ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
				str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
		{
			System.out.println("Vowel "+str.charAt(i)+" Position:"+ (i+1));
		}
	}
	}

}
