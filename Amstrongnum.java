import java.util.Scanner;

public class Amstrongnum {
	public static void main(String[] args) {
		  int sum=0,result,mul=1,temp=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("take the num to check no is prime or not" );
  int num=sc.nextInt();
 temp=num;

  
 while(num!=0)

  {
	  int R=num%10;
	  mul=R*R*R;
	  sum=sum+mul;
	  int Div=num/10;
	 System.out.println(sum); 
  }
  if(temp==sum)
	  System.out.println("num is amstrong");
  else 
	  System.out.println("num is not amsterong");
	}

}
