package practice;
/*2)Write a program to accept age and gender from the user and check the Rate Of Interest according to condition

age is above 60 then
Male: 7%
Female: 7.5%

age is below 60 then
Male,Female: 5%
*/
import java.util.Scanner;

public class RateOfInterest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int age,choice;
		System.out.println("\nEnter your choice for select gender\n1: Male\n2:Female");
		choice=sc.nextInt();
		System.out.println("Enter the Age of person");
		age=sc.nextInt();//accept the input number from user for age
		if(choice==1)
		{ 
			if(age>=60)
			{
				System.out.println("Rate of interest for Male is=7%");
			}
			else
				System.out.println("Rate of interest is 5%");
			
		}
		else
		{
			if(age>=60)
			{
				System.out.println("Rate of interest for Female is=7.5%");
			}
			else
				System.out.println("Rate of interest is 5%");
			
		}
		
}
}
