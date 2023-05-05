import java.util.Arrays;

public class ArrayOfNumbers2
{

    public static void main(String[] args)
    {
	// declare and initialize an array of integers in Java
	int arrayOfNumbers[] =
	    { 1, 2, 3, 4, 5, 6, 7, 11, 22, 9, 14, 16 };

	/*
	 * As you must provide the array size when declaring it, set the array lengths to the max
	 * 
	 */
	int[] oddNumbers = new int[arrayOfNumbers.length];
	int[] evenNumbers = new int[arrayOfNumbers.length];

	// Fill each array
	for (int i = 0, evenPtr = 0, oddPtr = 0; i < arrayOfNumbers.length; i++)
	{
	    if (arrayOfNumbers[i] % 2 == 0)
	    {
		evenNumbers[evenPtr] = arrayOfNumbers[i];
		evenPtr++;
	    } else
	    {
		oddNumbers[oddPtr] = arrayOfNumbers[i];
		oddPtr++;
	    }
	}

	// Display the contents of the arrays
	System.out.println(Arrays.toString(arrayOfNumbers) + " - all numbers");
	System.out.println(Arrays.toString(oddNumbers) + " - all odd numbers");
	System.out.println(Arrays.toString(evenNumbers) + " - all even numbers");

	/*
	 * Figure out the correct size required for each array
	 */
	int i = 0;
	int maxOddPtr = 0;
	while (oddNumbers[i] != 0)
	{
	    maxOddPtr++;
	    i++;
	}

	i = 0;
	int maxEvenPtr = 0;
	while (evenNumbers[i] != 0)
	{
	    maxEvenPtr++;
	    i++;
	}

	/*
	 * Declare arrays of the correct size to fit
	 * 
	 */
	int[] finalOddNumbers = new int[maxOddPtr];
	int[] finalEvenNumbers = new int[maxEvenPtr];

	// Populate the new arrays
	for (i = 0; i < maxOddPtr; i++)
	{
	    finalOddNumbers[i] = oddNumbers[i];
	}

	for (i = 0; i < maxEvenPtr; i++)
	{
	    finalEvenNumbers[i] = evenNumbers[i];
	}

	System.out.println(Arrays.toString(arrayOfNumbers) + " - all numbers");
	System.out.println(Arrays.toString(finalOddNumbers) + " - all odd numbers");
	System.out.println(Arrays.toString(finalEvenNumbers) + " - all even numbers");

    }

}