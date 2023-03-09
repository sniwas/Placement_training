import java.util.*;
public class check_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.print("Enter the Character : ");
		ch=sc.next().charAt(0);
		if(Character.isUpperCase(ch))
		{
			System.out.println(ch+" is UpperCase Character");
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println(ch+" is LowerCase Character");
		}
		else if(Character.isDigit(ch))
		{
			System.out.println(ch+" is a digit");
		}
		else
		{
			System.out.println(ch+" is a symbol");
		}
	}

}
