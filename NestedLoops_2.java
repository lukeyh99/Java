
/*Write a program that reads an integer and displays, using asterisks, a filled diamond
of the given side length. For example, if the side length is 4, the program should dis­play
     *
    ***
   *****
  *******
   *****
    ***
     *
 */

import java.util.Scanner;

public class NestedLoops_2
{
    public static void main(String[] args)
    {
    System.out.println("This code will print an X by X diamond to the screen.");
    System.out.println("How big is the side, X = ??");
    
    Scanner input = new Scanner(System.in);
	int diamondSide = input.nextInt();
	input.close();

	// Print the top "triangle"
	for (int row = 0; row < diamondSide - 1; row++)
	{
	    for (int col = 0; col < diamondSide * 2 - 1; col++)
	    {
			if ((col < diamondSide - (row + 1)) || (col > (diamondSide + (row - 1))))
			{
			    System.out.print(" ");
			} else
			{
			    System.out.print("*");
			}
	    }
	    System.out.println();
	}
	
	// Print the centreline
	for (int col = 0; col < diamondSide * 2 - 1; col++)
	{
	    System.out.print("*");
	}
	System.out.println();

	// Print the bottom "triangle"
	for (int row = diamondSide; row < diamondSide * 2 - 1; row++)
	{
	    for (int col = 0; col < diamondSide * 2 - 1; col++)
	    {
			if (((col >= (row + 1 - diamondSide)) && col < diamondSide) || ((col >= diamondSide) && (col - diamondSide) < (2 * diamondSide - (row + 2))))
			{
			    System.out.print("*");
			} else
			{
			    System.out.print(" ");
			}
	    }
	    System.out.println();
	}
    }
}
