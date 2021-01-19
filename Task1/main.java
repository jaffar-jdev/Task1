//numbers swap
import java.util.*;


public class Main{

	public static void main(String[] args){
		
		int a=100;
		int b=200;
		int temp;
		temp=a;
		a=b;
		b=temp;

		System.out.println("After swapping a="+a+"and b="+b);
		
		//without third variable

		int a = 1000;
		int b = 2000;
		b = b-a;
		a = a+b;
		System.out.println("After swapping a="+a+"and b="+b);
		
		System.out.println("Question2");
		//2. user input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Full Name: ");
		String name =in.nextLine();
		System.out.println("The input from user is: " +name);

		System.out.println("Question3");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 Number between 1 to 10: ");
		int x = input.nextInt();
		System.out.println("Enter 1 Number between 1 to 10: ");
		int y = input.nextInt();
		int z = x + y;
		int results = z + 30;
		
		System.out.println("The output is: "+results);
		
}
}