public class RemoveDuplicate {
	public static void removeDuplicate(int[] arr){
		int j=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[j])
				i++;
			else
				arr[++j]=arr[i++];
		}		
		for(int x: arr)
			System.out.print(x+" ");
			System.out.println();
	}

    public static void main(String[] args) {
        int[] arr1 = {1,1,1,1,2,3,3,3,3,4,5,5,5,6,6,7,7,7,8,8,9,9,9,9};
        int[] arr2 = {0,0,1,1,1,2,2,3,5,5,5,6,7,8,9,10,10,11,11,11,15,15,16,20,20,20,20};
        int[] arr3 = {1,2,3,4,5,6,7};
        removeDuplicate(arr1);
        removeDuplicate(arr2);
        removeDuplicate(arr3);
        
    }
}

// 1,2,1,1,2,3,3,3,3,4,5,5,5,6,6,7,7,7,8,8,9,9,9,9
// 	j	       
