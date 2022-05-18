import java.util.*;
public class Sorting{
	static class Point implements Comparable<Point>{
		int x,y;
		Point(int x, int y){
		this.x=x;
		this.y=y;
		}
		public int compareTo(Point p){
			return this.x-p.x;
		}
	}

	class Test{
    		public static void main(String[] args) {
        	Point[] arr ={new Point(10,20), new Point(3,12), new Point(5,7), new Point(15,18)};
        	Arrays.sort(arr);
        	for(int i=0;i<arr.length;i++)
        		System.out.println(arr[i].x + " " + arr[i].y);
    	}
    }
}
