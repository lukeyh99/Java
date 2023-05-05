public class InsertionSort
{

	public static void main(String[] args)
	{
		int[] unsortedArray = { 12, 34, 32, 4, 98, 3, 14 };
		for (int i : unsortedArray)
		{
			System.out.print(i);
			System.out.print(", ");
		}
		System.out.println("");

		int[] sortedArray = insertionSort(unsortedArray);
		for (int i : sortedArray)
		{
			System.out.print(i);
			System.out.print(", ");
		}
	}

	public static int[] insertionSort(int[] sortMe)
	{

		int temp;
		for (int i = 1; i < sortMe.length; i++)
		{
			for (int j = i; j > 0; j--)
			{
				if (sortMe[j] < sortMe[j - 1])
				{
					temp = sortMe[j];
					sortMe[j] = sortMe[j - 1];
					sortMe[j - 1] = temp;
				}
			}
		}
		return sortMe;
	}
}
