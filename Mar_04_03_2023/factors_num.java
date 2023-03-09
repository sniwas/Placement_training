import java.util.Scanner;
 public class factors_num{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            if(i%N==0)
            System.out.print(i+"," );
        }
    }
 }
