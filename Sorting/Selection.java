public class Selection {
	public static void Sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int min_idx = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min_idx])
					min_idx=j;
			}
			int x = arr[i];
			arr[i] = arr[min_idx] ;
			arr[min_idx] = x;		
//			Print(arr);	
		}
	}
	
	private static void Print(int[] arr){
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();
	}
	
    	public static void main(String[] args) {
       	int[] arr = {2,6,4,3,5,7,9,8,1,0};
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();
		Sort(arr);
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();
    }
}
