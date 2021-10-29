import java.util.Scanner;
public class Number {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a:");
		a=sc.nextInt();
		System.out.println("Enter the value b:");
		b=sc.nextInt();
		System.out.println("Enter the value c:");
		c=sc.nextInt();
		System.out.println("Enter the value of d:");
		d=sc.nextInt();
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		big=(big>d)?big:d;
		System.out.println(big+"is bigger");

	}

}
