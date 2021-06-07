import java.util.Scanner;

public class Purchase {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int pen,pencil,notebook,bottol,colorbox;
			int tot=0;
			int t1=0,t2=0,t3=0,t4=0,t5=0;
			int flag=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Cost of Pen");
			pen=sc.nextInt();
			System.out.println("Cost of Pencil");
			pencil=sc.nextInt();
			System.out.println("Cost of Notebook");
			notebook=sc.nextInt();
			System.out.println("Cost of Bottel");
			bottol=sc.nextInt();
			System.out.println("Cost of Colorbox");
			colorbox=sc.nextInt();	
			
			while (flag == 0) {
			int choice;
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				int q;				
				System.out.println("no of pen to purchase:");
				q=sc.nextInt();
				t1=pen*q;
				System.out.println("Cost of pen: "+t1);	
				break;
			case 2:
				int r;				
				System.out.println("no of pencil to purchase:");
				r=sc.nextInt();
				t2=pencil*r;
				System.out.println("Cost of penncil: "+t2);	
				break;
			case 3:
				int s;				
				System.out.println("no of notebook to purchase:");
				s=sc.nextInt();
				t3=notebook*s;
				System.out.println("Cost of notebook: "+t3);	
				break;
			case 4:
				int t;				
				System.out.println("no of bottol to purchase:");
				t=sc.nextInt();
				t4=bottol*t;
				System.out.println("Cost of bottol: "+t4);
				break;
			case 5:
				int u;
				System.out.println("no of colorbox to purchase:");
				u=sc.nextInt();
				t5=colorbox*u;
				System.out.println("Cost of colorbox: "+t5);
				break;
			case 6:
				flag=1;
				break;
			}	
			tot= t1 + t2 + t3 + t4 + t5;	
		}
			System.out.println("Total purchase cost is="+tot);
	}
	
}