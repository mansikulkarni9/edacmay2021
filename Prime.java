import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int num,count=0,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		 num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				
			}
				
		}
		if(count>2)
		{
			System.out.println("num is not prime");
			
		}else
			System.out.println("num is  prime");
	}

}
