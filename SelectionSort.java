//selection sort Algorithm (O(N*N))
public class SelectionSort {
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
    public static void selectionSort(int[] arr)
    {
    	for(int i=0; i<arr.length; i++)
    	{
    		for(int j=i+1; j<arr.length; j++)
    		{
    			if(arr[i]>arr[j])
    			{
    				int temp=arr[i];
    			    arr[i]=arr[j];
    			    arr[j]=temp;
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		int[] arr= {7,5,3,9,8};
	    System.out.println("The original array is...");
	    printArray(arr);
	    selectionSort(arr);
	    System.out.println("The array is after Sorting...");
        printArray(arr);

	}

}
