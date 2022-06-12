public class SecondLargest {
	public static void FindSecondLargest(int[] arr){
	int max=Integer.MIN_VALUE, max2= Integer.MIN_VALUE;
	for(int x : arr){
			if(x>max){
				max2 = max;
				max = x;
			}
			else if(x<max && x>max2 )
				max2 = x;		
		}
		System.out.println(max2);
	}

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,6,5,48,98,1,235,54,13,68,500,468,15,68,678,31,3,56,6,1,35,67,6,3,5};
        int[] arr2 = {5,684,13,135,76,43,13,54,6,1,31,4,68};
        int[] arr3 = {0,1};
        FindSecondLargest(arr1);
        FindSecondLargest(arr2);
        FindSecondLargest(arr3);
        
    }
}
