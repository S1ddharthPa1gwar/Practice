public class RotationBy1{
	
	static void printArray(int[] array){
		for(int x : array)
			System.out.print(x + " ");
			System.out.println();
	}
	
	static int[] Rotate(int[] arr,int len){
		 int x = arr[len-1];
     		 for(int i=len-1;i>0;i--)
     		       arr[i]=arr[i-1];
	        arr[0]=x;
     		return arr;
	}
	
	public static void main(String[] args){
	int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	printArray(arr);
//	printArray(Rotate1(arr,arr.length,5));
//	printArray(Rotate2(arr,arr.length,5));
	printArray(Rotate(arr,arr.length));
	}
}
