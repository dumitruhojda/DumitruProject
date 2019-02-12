import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello!");
//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line
		System.out.println(" Dumitru Hojda ");
//2. Write a Java program to print ‘The addition of 7 and 8 is: ‘, and then the sum of the two numbers
		int x = 7;
		int y = 8;
		System.out.println("The Adition of 7+8 is: "+(x+y));
	//3. Write a Java program to divide two numbers and print on the screen.

			Scanner input = new Scanner (System.in);
			System.out.print("Input the first number: 7");
			int a = input.nextInt();
			System.out.print("Input the second number: 8 ");
			int b = input.nextInt();
			int d = (a/b);
			System.out.println();
			System.out.println("The division of a and b is:" +d);



	}}