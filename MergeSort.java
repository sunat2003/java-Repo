//mergeSort
public class MergeSort
{
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void mergeSort(int arr[],int st,int end){
     if(st>=end) {
		 return;
	 }
	int mid=(st+end)/2;
	mergeSort(arr,st,mid);
	mergeSort(arr,mid+1,end);
	merge(arr,st,mid,end);
}
  //merge method
public static void merge(int arr[],int st,int mid,int end) {
	int n=arr.length;
	int n1=mid-st+1;
	int n2=end-mid;
	int left[]=new int[n1];
	int right[]=new int[n2];
	
	for(int i=0; i<n1; i++) {
		left[i]=arr[st+i];
	}

	for(int j=0; j<n2; j++) {
		right[j]=arr[mid+1+j];
	}
    int i=0,j=0,k=st;
	while(i<n1 && j<n2) {
		if(left[i]<right[j]) {
			arr[k++]=left[i++];
		} else {
            arr[k++]=right[j++];
		}
	}
	while(i<n1) {
		arr[k++]=left[i++];
	}
	while(j<n2) {
		arr[k++]=right[j++];
	}
    }

    //main method
	public static void main(String[] args) 
	{
	  int[] arr= {7,5,3,9,8};
      System.out.println("The arry before sorting is.. ");
      printArray(arr);
      mergeSort(arr,0,arr.length-1);
      System.out.println("The arry After sorting is.. ");
      printArray(arr);

   }
}
