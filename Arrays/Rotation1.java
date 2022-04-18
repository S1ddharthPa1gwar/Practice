public class Rotation1{
	
	static void printArray(int[] array){
		for(int x : array)
			System.out.print(x + " ");
			System.out.println();
	}
	
	static int[] Rotate1(int[] arr,int len,int n){
		n=n%len;
		int[] temp = new int[n];
		for(int i=0;i<n;i++)
			temp[i]=arr[i];
		
		for(int i=0;i<len-n;i++)
			arr[i]=arr[i+n];
		
		for(int i=0;i<n;i++)
			arr[len-n+i]=temp[i];
	
			return arr;
	}
	
	static int[] Rotate2(int[] arr,int len,int n){
		n=n%len;
		for(int i=0;i<n;i++){
			int x= arr[0];
			for(int j=1;j<len;j++)
				arr[j-1]=arr[j];
			arr[len-1]=x;
		}			
		return arr;
	}
	
	static int[] Rotate3(int[] arr,int len,int n){
       	 n=n%len;
       	swap(arr,0,n-1);
       	swap(arr,n,len-1);
       	swap(arr,0,len-1);
       	return arr;
    	}
    
    	static void swap(int[] arr,int l, int r){
       	 while(l<r){
       	     int x = arr[l];
       	     arr[l] = arr[r];
       	     arr[r] =x;
       	     l++;
       	     r--;
       	 }
 	}
    
	
	public static void main(String[] args){
	int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	printArray(arr);
//	printArray(Rotate1(arr,arr.length,5));
//	printArray(Rotate2(arr,arr.length,5));
	printArray(Rotate3(arr,arr.length,5));
	}
}
