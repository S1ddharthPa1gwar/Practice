public class isSorted {
	
	public static boolean isSorted(int[] arr){
		for(int i=0;i<arr.length-1;i++)
			if(arr[i]>arr[i+1])
				return false;
		return true;
	}

    public static void main(String[] args) {
        int[] arr4 = {1,2,3,4,5,6,7,8,9};
        int[] arr5 = {1,2,3,5,4,6,7,8,9};
        int[] arr6 = {};
        System.out.println(isSorted(arr4));
        System.out.println(isSorted(arr5));
        System.out.println(isSorted(arr6));
    }
}
