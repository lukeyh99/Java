public class BinarySearch
{
    // Returns index of x if it is present in arr[left...right], else return -1
    int binarySearch(int arr[], int left, int right, int x)
    {
	System.out.println("Recursive call to binarySearch...");
	if (right >= left)
	{
	    int mid = left + (right - left) / 2;

	    // If the element is present at the
	    // middle itself
	    if (arr[mid] == x)
		return mid;

	    // If element is smaller than mid, then
	    // it can only be present in left subarray
	    if (arr[mid] > x)
		return binarySearch(arr, left, mid - 1, x);

	    // Else the element can only be present
	    // in right subarray
	    return binarySearch(arr, mid + 1, right, x);
	}

	// We reach here when element is not present
	// in array
	return -1;
    }

}
