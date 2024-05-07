//countSort
public class CountSort {
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	//maxEle
	public static int maxEle(int[] arr)
	{
		int maxElement=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>maxElement)
			{
				maxElement=arr[i];
			}
		}
		return maxElement;
	}
	public static void countSort(int[] arr)
	{
		int max=maxEle(arr);
		int[] count=new int[max+1];
		for(int i=0; i<arr.length; i++)
		{
			count[arr[i]]++;
		}
		int k=0;
		for(int i=0; i<count.length; i++)
		{
			for(int j=0; j<count[i]; j++)
			{
				arr[k++]=i;
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {7,5,3,9,8};
	    System.out.println("The original array is...");
	    printArray(arr);
	    countSort(arr);
	    System.out.println("The array is after Sorting...");
        printArray(arr);
	}
}
