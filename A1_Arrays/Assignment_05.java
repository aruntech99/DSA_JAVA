public class Assignment_05
{
	public static void main (String[]args)
	{
	  int arr[] = { 1, 2, 3, 5 };
	  int N = arr.length;
	  System.out.println ("The minimum element is " + findMin (arr, 0, N - 1));
	}
     public static int findMin (int arr[], int low, int high)
    { 
    if (arr[low] <= arr[high])
      {
	return arr[low];
      } 
    while (low <= high)
      {
	int mid = (low + high) / 2; 
	if (arr[mid] < arr[mid - 1])
	  {
	    return arr[mid];
	  } 
	if (arr[mid] > arr[high])
	  {
	    low = mid + 1;
	  } 
	else
	  {
	    high = mid - 1;
	  }
      } 
    return -1;
    } 
}
