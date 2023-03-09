import java.util.*;
public class ascending_character_value {

	public static void main(String[] args) {
		char a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two character values:");
		a=sc.next().charAt(0);
		b=sc.next().charAt(0);
		if(a<b)
		{
			System.out.println(a+" "+b);
		}
		else
		{
			System.out.println(b+" "+a);
		}

	}

}
