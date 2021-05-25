
public class CI {
public static void main(String[] args) {
	int principle=5000;
	double rate=3;
	int time=2;
	double t=1;
	rate=(1+rate/100);
    System.out.println("rate"+rate);
    for(int i=0;i<time;i++)
    {
      t=t*rate;
    }

double amount=principle*t;

System.out.println("amount="+amount);

double ci=amount-principle;

System.out.println("compound intrest="+ci);

}
}
