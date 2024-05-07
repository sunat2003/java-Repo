//Bubble Sort Algorithm(ase order) O(N*N)
public class BubbleSort {
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
    public static void bubbleSort(int[] arr)
    {
    	for(int i=0; i<arr.length; i++)
    	{
    		for(int j=0; j<arr.length-i-1; j++)
    		{
    			if(arr[j]>arr[j+1])
    			{
    				int temp=arr[j];
    			    arr[j]=arr[j+1];
    			    arr[j+1]=temp;
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		int[] arr= {7,4,3,1,9,5};
	    System.out.println("The original array is...");
	    printArray(arr);
	    bubbleSort(arr);
	    System.out.println("The array is after Sorting...");
        printArray(arr);
	    
	}

}
