//Quick Sort Algorithim (O(N*N))
public class QuickSort {
    //PrintArray
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void swap(int[] arr,int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static int partition(int[] arr,int st,int end)
	{
		int pivotElement=arr[st];
		int count=0;
		for(int i=st+1; i<arr.length; i++)
		{
			if(arr[i]<=pivotElement)
			{
				count+=1;
			}
		}
		int pivotIndex=st+count;
		swap(arr,st,pivotIndex);
		int i=st;
		int j=end;
		
		while(i<pivotIndex && j>pivotIndex)
		{
			while(arr[i]<pivotElement)
			{
				i++;
			}
			while(arr[j]>pivotElement)
		    {
			  j--;	
			}
			if(i<pivotIndex && j>pivotIndex)
			{
				swap(arr,i,j);
				i++;
				j--;
			}
		}
		return pivotIndex;
	}
	public static void quickSort(int[] arr,int st,int end)
	{
		if(st>=end)
		{
			return;
		}
		int pivotIndex=partition(arr,st,end);
		quickSort(arr,st,pivotIndex-1);
		quickSort(arr,pivotIndex+1,end);
	}
	public static void main(String[] args) {
		int[] arr= {7,5,3,9,8};
	    System.out.println("The original array is...");
	    printArray(arr);
	    quickSort(arr,0,arr.length-1);
	    System.out.println("The array is after Sorting...");
        printArray(arr);
	}

}
