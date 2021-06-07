import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		a=sc.nextInt();
		
		for (int i=1;i<a;i++) {
			if (i%2==0)
				System.out.println("Even no are:"+i);
			else
				System.out.println("Odd no are:"+i);
		}
		
		
	}

}
