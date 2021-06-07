import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0, m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		  m=n;    
		  while(n>0){    
		   int r=n%10;
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(m==sum)    
		   System.out.println("Palindrome number ");    
		  else    
		   System.out.println("Not a palindrome");
	}

}
