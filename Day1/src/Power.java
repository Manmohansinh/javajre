import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m =");
		m=sc.nextInt();
		System.out.println("Enter n =");
		n=sc.nextInt();
		while (n != 0)
		{
			c=c*m;
			n--;
		}
		
		System.out.println("m to power of n is="+c);
		
		
		
	}

}
