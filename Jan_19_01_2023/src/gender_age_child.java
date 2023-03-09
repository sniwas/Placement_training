import java.util.Scanner;
public class gender_age_child {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gender;
		System.out.print("Enter Gender : ");
		 gender=sc.nextLine();
		System.out.print("Enter Age : ");
		int age=sc.nextInt();
		
		if(gender.equalsIgnoreCase("Male"))
		{
			System.out.print("He ");
		}
		else if(gender.equalsIgnoreCase("Female"))
		{
			System.out.print("She ");
		}
		if(!gender.isEmpty())
		{
		if (age>0 && age<16)
			System.out.println("is child");
		else if (age>15)
			System.out.println("is adult");
		}
	}
}