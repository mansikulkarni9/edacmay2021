import java.util.Scanner;

public class Fabinacci {
	public static void main(String[] args)
	{
	 int num;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the num");
	 num=sc.nextInt();
	Faboanacci(num);
	 //System.out.println("sum"+sum);
	}

	public static int  Faboanacci(int a)
	{  
		int n1=0,n2=1;
		 System.out.print(" "+n1);
		 System.out.print(" "+n2);

		 
	for(int i=1;i<=a;i++)
	{
		
		  int n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;  
	}
		return 0;
		
	}
	

}
