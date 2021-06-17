import java.util.Scanner;
public class Swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			  int a, b, c;
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter Value in a :");
			  a=sc.nextInt();
			  System.out.println("Enter Value in b :");
			  b=sc.nextInt();
			  sc.close();
			  c=a;
			  a=b;
			  b=c;
			  System.out.println("Values in a:" +a);
			  System.out.println("Values in b:" +b);
			 }
		
	}

}
