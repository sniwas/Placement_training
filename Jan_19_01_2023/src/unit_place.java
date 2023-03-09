import java.util.Scanner;
public class unit_place {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("Enter number : ");
		a=sc.nextInt();
		System.out.println("One's place : "+a%10);
		System.out.println("Ten's place : "+(a%100)/10);
		System.out.println("Ten's place : "+(a/10)%10);
		System.out.println("Hundred's place : "+(a%1000)/100);
		System.out.println("Hundred's place : "+(a/100)%10);
		
	}

}
