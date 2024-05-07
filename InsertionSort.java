//insertion sort Algorithm(O(N*N))
public class InsertionSort {
	//printing of array
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
    public static void insertionSort(int[] arr)
    {
    	for(int i=1; i<arr.length; i++)
    	{
    		int j=i;
    		while(j>0 && arr[j]<arr[j-1])
    		{
    			int temp=arr[j];
    			arr[j]=arr[j-1];
    			arr[j-1]=temp;
    			j--;
    		}
    	}
    	
    }
	public static void main(String[] args) {
		int[] arr= {7,5,3,9,8};
	    System.out.println("The original array is...");
	    printArray(arr);
	    insertionSort(arr);
	    System.out.println("The array is after Sorting...");
        printArray(arr);
	}

}
