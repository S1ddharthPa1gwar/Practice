public class ReverseArray {
	public static void reverseArray(int[] arr){
	int lo=0,hi=arr.length-1;
	while(lo<=hi){
		int x= arr[lo];
		arr[lo++]=arr[hi];
		arr[hi--]=x;		
		}
		for(int x: arr)
			System.out.print(x+" ");
	}

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,6,5,48,98,1,235,54,13,68,500,468,15,68,678,31,3,56,6,1,35,67,6,3,5};
        int[] arr2 = {5,684,13,135,76,43,13,54,6,1,31,4,68};
        int[] arr3 = {0,1};
        reverseArray(arr1);
        reverseArray(arr2);
        reverseArray(arr3);
        
    }
}
