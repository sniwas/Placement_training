import java.util.*;
public class generate_pwd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		System.out.print("Enter your rollno : ");
		int rollno=sc.nextInt();
		System.out.print("Enter your pincode : ");
		int pin=sc.nextInt();
		String pwd=""+name.charAt(0)+name.charAt(1)+(rollno%10)+(pin%100);
		System.out.println("Password generated = "+pwd);

	}

}
