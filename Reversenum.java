import java.util.Scanner;

public class Reversenum {
	
	public static int Reversnum(int num)
	{  int sum=0;
	
		while(num!=0)
		{
            int R=num%10;
		    sum=(10*sum)+R;
		    num=num/10;
	   }
		return sum;
		//System.out.println("Reverse num is"+sum);
	}
	public static void main(String[] args)
	{
		int a,sum;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		a=sc.nextInt();
		sum=Reversnum(a);
		System.out.println("Reverse num is"+sum);

		
		
	}

}
