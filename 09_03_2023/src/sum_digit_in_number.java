import java.util.*;
public class sum_digit_in_number 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number to find the sum of digits : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,num;
		while(n!=0)
		{
			num=n%10;
			sum=sum+num;
			n=n/10;
		}
		System.out.println("Sum of digits : "+sum);
	}

}
