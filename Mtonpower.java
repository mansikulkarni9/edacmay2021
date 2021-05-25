import java.util.Scanner;

public class Mtonpower {

	public static void main(String[] args) {
		
		int a,b,i;
		int power;
		System.out.println("power of the two num");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		 a=sc.nextInt();
		 System.out.println("enter the 2nd num");
		 b=sc.nextInt();
		 for(i=1;i<=b;i++)
		 {
			 a=a*i;
		 }
		System.out.println("power of num a^b ="+a);
		
		
		// TODO Auto-generated method stub

	}

}
