public class Bubble {
	public static void Sort(int[] arr){			//O(n^2 in all cases)
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int x= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = x;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,6,4,3,5,7,9,8,1,0};
		for(int x: arr)
			System.out.print(x + " ");
		Sort(arr);
		System.out.println();
		for(int x: arr)
			System.out.print(x + " ");
    }
}
