public class MergeSort
{
	// Function that sorts arr[left...right] using merge() 
	void sort(int arr[], int left, int right)
	{
		if (left < right)
		{
			// Find the middle point 
			int middle = (left + right) / 2;

			// Sort first and second halves 
			sort(arr, left, middle);
			sort(arr, middle + 1, right);

			// Merge the sorted halves 
			merge(arr, left, middle, right);
		}
	}

	// Merges two subarrays of arr[]. 
	// First subarray is arr[left..middle] 
	// Second subarray is arr[middle+1..right] 
	void merge(int arr[], int left, int middle, int right)
	{
		// Find sizes of two subarrays to be merged 
		int n1 = middle - left + 1;
		int n2 = right - middle;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[middle + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays 
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = left;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			} else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

}
