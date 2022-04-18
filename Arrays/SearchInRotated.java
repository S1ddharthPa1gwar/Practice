public class SearchInRotated{
	
	static void printArray(int[] array){
		for(int x : array)
			System.out.print(x + " ");
			System.out.println();
	}
	
	static int findPivot(int[] arr,int lo, int hi){
		if(hi<lo)
			return -1;
		if(hi==lo)
			return hi;
		int mid = lo + (hi-lo)/2;
		if(mid<hi && arr[mid]>arr[mid+1])
			return mid;
		if(mid>lo && arr[mid]<arr[mid-1])
			return mid-1;
		if(arr[mid] <= arr[lo])
			return findPivot(arr,lo,mid-1);
		return findPivot(arr,mid+1,hi);
	}	
	
	static int findElement(int[] arr,int len, int n){
		int pivot= findPivot(arr,0,len);
		if(pivot==-1)
			return 
		if(arr[mid]>arr[0] && arr[mid]
	}
	
	public static void main(String[] args){
	int[] arr = {11,12,13,14,15,16,17,18,19,1,2,3,4,5,6,7,8,9,10};
	printArray(arr);
//	printArray(Rotate1(arr,arr.length,5));
//	printArray(Rotate2(arr,arr.length,5));
	System.out.println(findPivot(arr,0,arr.length));
	}
}
