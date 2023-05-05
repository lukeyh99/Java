import java.util.Scanner;

public class TowersOfHanoi
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of rings: ");
		int rings = in.nextInt();

		move_1(rings, "A", "C", "B");
		//move_2(rings, "A", "C", "B");

		in.close();
	}

	public static void move_1(int n, String start, String end, String helper)
	{
		if (n == 1)
		{
			System.out.println("Move ring from peg " + start + " to peg " + end);
		} else
		{
			move_1(n - 1, start, helper, end);
			System.out.println("Move ring from peg " + start + " to peg " + end);
			move_1(n - 1, helper, end, start);

		}
	}

	public static void move_2(int n, String left, String right, String center)
	{
		if (n == 1)
		{
			System.out.println("Move ring from peg " + left + " to peg " + right);
		} else
		{
			move_2(n - 1, left, center, right);
			System.out.println("Move ring from peg " + left + " to peg " + right);
			move_2(n - 1, center, right, left);

		}
	}

}
