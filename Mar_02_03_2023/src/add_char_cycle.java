import java.util.Scanner;
public class add_char_cycle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch=sc.next().charAt(0);
		System.out.print("Enter a number to add the values of the character : ");
		int add=sc.nextInt();
		char res=(char) (ch+add);
		if(res<='z'){
		System.out.println(res);
		}
		else if(res>'z')
		{
			
		}
	}

}
