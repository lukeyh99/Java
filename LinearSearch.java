public class LinearSearch
{
	public static int linearSearch(int arr[], int x)
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String args[])
	{
		int arr[] = { 32, 25, 35, 6, 11, 42, 19 };
		int x = 11;

		System.out.print("Given Array: ");
		printArray(arr);
		System.out.println("");

		int result = linearSearch(arr, x);
		if (result == -1)
			System.out.print("Element " + x + " is not present in array");
		else
			System.out.print("Element " + x + " is present at index " + result);
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
