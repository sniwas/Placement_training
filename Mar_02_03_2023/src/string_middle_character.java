import java.util.*;
public class string_middle_character {

	public static void main(String[] args) {
		String s;
		System.out.print("Enter a String : ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int len=s.length();
		if(len%2==0)
		{
			System.out.println("No Middle character");
		}
		else
		{
			System.out.println(s.charAt(len/2));
		}

	}

}
