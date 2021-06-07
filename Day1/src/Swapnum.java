import java.util.Scanner;

public class Swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a =");
		a=sc.nextInt();
		System.out.println("Enter b =");
		b=sc.nextInt();	
		c=a;
		a=b;
		b=c;
		System.out.println("New value of a= "+a);
		System.out.println("New value of b= "+b);
		
	}

}
