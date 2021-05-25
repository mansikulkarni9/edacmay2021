
import java.util.Scanner;

public class Pallimdrom {
	
	public static void Reversnum(int num)
	{  int sum=0,temp=0;
	     temp=num;
		while(num!=0)
		{
            int R=num%10;
		    sum=(10*sum)+R;
		    num=num/10;
	   }
		if(temp==sum)
			System.out.println("num is pallimdrom");
		else System.out.println("num is not pallimdrom");
		//System.out.println("Reverse num is"+sum);
	}
	public static void main(String[] args)
	{
		int a,sum,temp=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		a=sc.nextInt();
		
		Reversnum(a);
	

		
		
	}

}
