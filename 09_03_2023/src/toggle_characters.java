import java.util.*;
public class toggle_characters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter a string : ");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				Character.toUpperCase(str.charAt(i));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				Character.toLowerCase(str.charAt(i));//type casting
			}
			else
			{
			}
		}
			
		System.out.println(str);
	}

}
