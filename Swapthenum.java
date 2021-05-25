import java.util.Scanner;

public class Swapthenum {
	public static void main(String[] args) {
		
		int a ,b,temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 1st value");
		a=sc.nextInt();
		System.out.println("enter the 2nd values");
		b=sc.nextInt();
		System.out.println("num before the swap");

		
		System.out.println("a = "+a);
	System.out.println("b = "+b);
	System.out.println("_________________________________");
	 temp=a;
	 a=b;
	 b=temp;
		System.out.println("num after the swap");

	 System.out.println("a = "+a);
	 System.out.println("b = "+b);
	 
	
	}

}
