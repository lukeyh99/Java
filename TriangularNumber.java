import java.util.Scanner;

public class TriangularNumber
{

	public static void main(String[] args)
	{
		TriangularNumber triNum = new TriangularNumber();

		Scanner in = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = in.nextInt();

		System.out.println("\nTriangular Number: " + triNum.getTriangularNum(num) + "\n");
		System.out.println("_________________________________________________\n");
		System.out.println("\nTriangular Number using Recursion: " + triNum.getTriangularNumR(num));
		System.out.println("\n_________________________________________________\n");
		in.close();
	}

	public int getTriangularNum(int number)
	{
		int triangularNumber = 0;

		while (number > 0)
		{
			triangularNumber = triangularNumber + number;
			number--;
		}

		return triangularNumber;
	}

	public int getTriangularNumR(int number)
	{
		System.out.println("Method Call; num = " + number);
		if (number == 1)
		{
			System.out.println("Returned 1");
			return 1;
		} else
		{
			int result = number + getTriangularNumR(number - 1);
			System.out.print("Return " + result);
			System.out.println(" : " + number + " + getTriangularNumR(" + number + " - 1)");
			return result;
		}

	}

}
