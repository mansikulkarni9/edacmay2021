import java.util.Scanner;

public class Greatestnum {
	public static void main(String[] args) {
		
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		num1=sc.nextInt();
		System.out.println("enter the num2");
		num2=sc.nextInt();
		System.out.println("enter the num3");
		num3=sc.nextInt();
		if(num1>num2&&num1>num3)
		{
		
			
				System.out.println("num1"+num1);
				
		}else if(num2>num1&&num2>num3)
		{
				System.out.println("num2"+num2
						);
		}else if(num3>num1&&num3>num2)
		
			System.out.println("num3:-"+num3);
		}

}
