import java.util.Scanner;
public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int num;
		int flag = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num =");
		num=sc.nextInt();  
		for (int i = 2; i <= num / 2; ++i) {
		if (num % i == 0) {
			flag = 1;
			break;
			}
		}

		if (flag == 0)
		 System.out.println("It is a prime number.");
		else
		System.out.println("It is not a prime number.");
		}
}
