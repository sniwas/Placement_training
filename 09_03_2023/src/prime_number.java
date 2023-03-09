import java.util.*;
public class prime_number {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		for (int j=1;j<100;j++)
		{
		System.out.print("Enter a number : ");
		num=j;
		int f=0;
		if(num==0||num==1)
		{
			f=1;
			System.out.println("Enter number "+num+" is not a prime number");
		}
		else
		{
			for(int i=2;i<num;i++)
				if(num%i==0)
				{
					f=1;
					System.out.println("Enter number "+num+" is not a prime number");
					break;
				}
			
		}
		if(f==0)
		{
			System.out.println("Enter number "+num+" is a prime number");
		}

	}
	}
}
