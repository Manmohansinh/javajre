import java.util.Scanner;

public class Scarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();	
		}
		
		int choice;
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			int sum=0;
			for (int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			System.out.println("Sum is:" +sum);
		case 2:
			int s=0, avg=0;
			for (int i=0;i<arr.length;i++) {
				s=s+arr[i];
				avg=s/arr[i];
			}
			System.out.println("Avg is:" +avg);
		case 3:
			int min=arr[0];
			for (int i=0;i<arr.length;i++) {
				
				if (arr[i]<min)
					min=arr[i];
			}
			System.out.println("Min is:" +min);
		case 4:
			int max=arr[0];
			for (int i=0;i<arr.length;i++) {
				
				if (arr[i]>max)
					max=arr[i];
			}
			System.out.println("Max is:" +max);
		}		
	}
}
