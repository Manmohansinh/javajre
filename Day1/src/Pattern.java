import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a =");
		a=sc.nextInt();
		
		for (int i=1;i<a;i++) {
			for (int j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
