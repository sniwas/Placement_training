import java.util.Scanner;
public class character_cycle_adding {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch=sc.next().charAt(0);
		char ch1=Character.toUpperCase(ch);
		System.out.print("Enter a number to add the values of the character : ");
		int add=sc.nextInt();
		
		char res=(char) (ch+add);
		
		if(res>='A' && res<='Z')
		{
		res=res;
		}
		else 
		{
		   res=(char)(res-26);
		}
		
		if(Character.isLowerCase(ch))
		{
		   
		    System.out.println(Character.toLowerCase(res));
		}
		else
		{
		    System.out.println(res);
		}
	}

}
