import java.util.Scanner;

public class Evenandodd {
	public static void main(String[] args)
	{
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
		evenodd(num);
	}
	public static void evenodd(int a)
	{
		int sum=0;
		int sum1=0;
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			else {
				sum1=sum1+i;
			}
		}
		System.out.println(sum);
		System.out.println(sum1);

	}
	

}
