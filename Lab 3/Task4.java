import java.util.*;
class Task4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number : ");
		float num1 = input.nextDouble();
		System.out.println("Enter second number : ");
		float num2 = input.nextDouble();
		System.out.printlnl("Enter the operation : ");
		char operation = input.next().charAt(0);
		switch(operation)
		{
			case ' + ' :
			float sum = num1+num2;
			System.out.println(num1 + " + " + num2 + " = " + sum);
			break;
			case ' - ' :
			float subtraction = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + subtraction);
			break;
			case ' * ' :
			double multipication = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + multipication);
			break;
			case ' / ' :
			double division = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + division);
			break;
			default :
			System.out.println("Invalid operator");
		}
	}
}