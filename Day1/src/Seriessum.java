import java.util.Scanner;
public class Seriessum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num, sum=0;
	      System.out.println("Enter Number ");
	      Scanner sc=new Scanner(System.in);
	      num = sc.nextInt();
	      for (int i = 0; i<num; i++){
	         sum = sum +i;
	      }
	      System.out.println("Sum of numbers is: "+sum);
	}

}
