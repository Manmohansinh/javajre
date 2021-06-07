import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a =");
		a=sc.nextInt();
		b=a;
		while (a>1)
		{
			fact=fact*a;
			a--;
		}
		System.out.println("Factorial of a is= "+fact);
		
	}
}
