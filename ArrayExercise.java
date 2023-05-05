
/*
*
*	Write array methods that carry out the following tasks for an array of integers. For
*	each method, provide a test program.
*		a.   Swap the first and last elements in the array.
*		b.   Shift all elements by one to the right and move the last element into the first position.
*				For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
*		c.   Replace all even elements with 0.
*		d.   Replace each element except the first and last by the larger of its two neighbours.
*		e.   Remove the middle element if the array length is odd, or the middle two elements if the length is even.
*		f.   Move all even elements to the front, otherwise preserving the order of the elements.
*		g.   Return the second-largest element in the array.
*		h.   Return true if the array is currently sorted in increasing order.
*		i.   Return true if the array contains two adjacent duplicate elements.
*		j.   Return true if the array contains duplicate elements (which need not be adjacent).
*
*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] array = new int[10]; // Declare an integer array to hold 10 integers

		for (int i = 0; i < array.length; i++) // Fill the array, with input from the user
		{
			System.out.printf("Element[%d] of array = ", i );
			array[i] = input.nextInt();
		}
		input.close(); // Close the scanner

		System.out.printf("Array after input: %s\n", Arrays.toString(array)); // Display the initial array

		/*
		 * Call the various methods to do the real work -
		 * swapFirstAndLastElement(array); - shiftAllElements(array); -
		 * replaceAllEvenElements(array); - replaceWithNeighbours(array); - int[]
		 * newArray = removeMiddleElement(array); - moveEvenElementsToTheFront(array); -
		 * int secondLargest = secondLargestElement(array); - boolean isIncreasing =
		 * isArrayIncreasingOrder(array); - boolean isAdjacentDuplicates =
		 * adjacentDuplicateElements(array); - boolean isContainDuplicates =
		 * containDuplicateElements(array);
		 */
		swapFirstAndLastElement(array);
		System.out.printf("Swapped first and last element: %s\n", Arrays.toString(array));

		shiftAllElements(array);
		System.out.printf("Shifted elements: %s\n", Arrays.toString(array));

		replaceAllEvenElements(array);
		System.out.printf("Replaced even elements: %s\n", Arrays.toString(array));

		replaceWithNeighbours(array);
		System.out.printf("Replace elements with their neighbours: %s\n", Arrays.toString(array));

		int[] newArray = removeMiddleElement(array);
		System.out.printf("Removed middle elements: %s\n", Arrays.toString(newArray));

		moveEvenElementsToTheFront(array);
		System.out.printf("Moved even elements to the front: %s\n", Arrays.toString(array));

		int secondLargest = secondLargestElement(array);
		System.out.printf("Second largest element is: %d\n", secondLargest);

		boolean isIncreasing = isArrayIncreasingOrder(array);
		System.out.printf("The sequence is increasing? %s\n", isIncreasing);

		boolean isAdjacentDuplicates = adjacentDuplicateElements(array);
		System.out.printf("The sequence contains adjacent duplicates? %s\n", isAdjacentDuplicates);

		boolean isContainDuplicates = containDuplicateElements(array);
		System.out.printf("The sequence contains duplicates? %s\n", isContainDuplicates);
	}

	public static void swapFirstAndLastElement(int[] array)
	{
		// use temp variable to hold the first value as you do the swap
		int temporaryVariable = array[0];
		array[0] = array[array.length - 1];
		array[array.length - 1] = temporaryVariable;
	}

	public static void shiftAllElements(int[] array)
	{

		// use temp variable to hold the last value as you do the shift right
		int lastElement = array[array.length - 1];

		for (int i = array.length - 1; i > 0; i--)
		{
			array[i] = array[i - 1];
		}

		array[0] = lastElement;
	}

	public static void replaceAllEvenElements(int[] array)
	{
		// Set up a loop to walk through the array
		for (int i = 0; i < array.length; i++)
		{
			// Search for and obliterate the even numbers
			if (array[i] % 2 == 0)
			{
				array[i] = 0;
			}
		}
	}

	public static void replaceWithNeighbours(int[] array)
	{
		// Set up a loop to walk through the array
		for (int i = 1; i < array.length - 1; i++)
		{
			// for array[i], check it's neighbours array[i-1] and array[i+1] to see which is
			// larger, then replace array[i] with the larger one
			int larger = array[i - 1];

			if (larger < array[i + 1])
			{
				larger = array[i + 1];
			}

			array[i] = larger;
		}
	}

	public static int[] removeMiddleElement(int[] array)
	{
		// Find the middle of the array
		int firstMiddleIndex = (array.length / 2) - 1;

		// If there is an even number in the array...
		if (array.length % 2 == 0)
		{
			// Create a new array that holds 2 less integers
			int[] newArray = new int[array.length - 2];

			for (int i = 0; i < firstMiddleIndex; i++)
			{
				newArray[i] = array[i];
			}

			for (int i = firstMiddleIndex; i < newArray.length; i++)
			{
				newArray[i] = array[i + 2];
			}

			return newArray;
		} else
		{
			int[] newArray = new int[array.length - 1];

			for (int i = 0; i <= firstMiddleIndex; i++)
			{
				newArray[i] = array[i];
			}

			for (int i = firstMiddleIndex + 1; i < newArray.length; i++)
			{
				newArray[i] = array[i + 1];
			}

			return newArray;
		}
	}

	public static void moveEvenElementsToTheFront(int[] array)
	{
		int lastEvenElementIndex = 0;

		for (int i = 0; i < array.length; i++)
		{
			// Find the Even elements
			if (array[i] % 2 == 0)
			{
				// Do the 3 variable integer shuffle, to swap array values
				int temporaryVariable = array[i];
				array[i] = array[lastEvenElementIndex];
				array[lastEvenElementIndex] = temporaryVariable;
				lastEvenElementIndex++;
			}
		}
	}

	public static int secondLargestElement(int[] array)
	{
		int firstLargestElement = array[0];
		int secondLargestElement = array[0];

		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > firstLargestElement)
			{
				secondLargestElement = firstLargestElement;
				firstLargestElement = array[i];
			}
		}

		return secondLargestElement;
	}

	public static boolean isArrayIncreasingOrder(int[] array)
	{
		int currentElement = array[0];

		for (int i = 1; i < array.length; i++)
		{
			if (currentElement > array[i])
			{
				return false;
			}

			currentElement = array[i];
		}

		return true;
	}

	public static boolean adjacentDuplicateElements(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++)
		{
			if (array[i] == array[i + 1])
			{
				return true;
			}
		}

		return false;
	}

	public static boolean containDuplicateElements(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++)
			{
				if (i != j && array[i] == array[j])
				{
					return true;
				}
			}
		}

		return false;
	}
}