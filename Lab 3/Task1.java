import java.util.*;
class Task1
{
	public static void main(String[] args)
	{
Scanner input = new Scanner(System.in);
System.out.println("Enter your C++ marks : ");
int cpp = input.nextInt();
System.out.println("Enter your Data Structure marks : ");
int data = input.nextInt();
System.out.println("Enter your Operating System marks : ");
int operatingsystem = input.nextInt();
int sum = cpp+data+operatingsystem;
double per = (sum/300.0)*100;
System.out.print("\nYour percentage = "+per);
	if(per>=90)
	{
	System.out.println("You got A grade ");
	}
	else if(per>=80 && per <90)
	{
	System.out.println("You got B grade");
	}
	else if(per>=70 && per <80)
	{
	System.out.println("You got c grade");
	}
	else if(per>=60 && per <70)
	{
	System.out.println("You got B grade");
	}
	else
	{
	System.out.println("Please improve");
	}
	}
}