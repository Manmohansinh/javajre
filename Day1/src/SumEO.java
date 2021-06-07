import java.util.Scanner;

public class SumEO {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int Esum=0, Osum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		a=sc.nextInt();
		
		for (int i=1;i<a;i++) {
			if (i%2==0) 
				Esum=Esum+i;
			else 
				Osum=Osum+i;
		}
		System.out.println("Even no are:"+Esum);
		System.out.println("Odd no are:"+Osum);
	}
}
