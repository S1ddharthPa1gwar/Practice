public class Insertion {
	public static void Sort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int key=arr[i],j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;				
			}
			arr[j+1]=key;			
		}
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
