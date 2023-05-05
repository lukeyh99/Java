import java.util.Scanner;

/*
Write a program that prints the balance of an account after the first, second, and
third year. The account has an initial balance of $1,000 and earns 5 percent interest
per year.
*/

public class AccountBalance2
{
    public static void main(String[] args)
    {
	double balance;
	double percentInterestPerYear;

	Scanner in = new Scanner(System.in);

	System.out.printf("What is your initial balance? \t\t\t");
	balance = in.nextDouble();

	System.out.printf("What is the interest rate on this account?\t");
	percentInterestPerYear = in.nextDouble();

	System.out.printf("\n");
	System.out.println();

	for (int year = 1; year <= 3; year++)
	{
	    balance = balance + balance * percentInterestPerYear;
	    System.out.printf("Year balance for %d year is %.2f \n", year, balance);
	}

	in.close();
    }
}
