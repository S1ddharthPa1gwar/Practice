/*

*/

import java.util.*;

public class Test {

static Scanner scan = new Scanner(System.in);
    static int[][] mat;
    public static void problem1(){        
        System.out.println("Enter number of rows : ");
        int r = scan.nextInt();
        System.out.println("Enter number of columnx : ");
        int c = scan.nextInt();
        mat = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c ; j++){
                mat[i][j] = (int)((Math.random())*100);
            }
        }
        
        for(int[] arr : mat){
            for(int x : arr){
                System.out.print(x + "\t" );
            }
            System.out.println();
        }
    }
    /*
    public static void problem2(int c){
        if(c >= mat.length){
            System.out.print("Column out of bound");
            return;
        }
        
        ArrayList<pair> arr = new ArrayList(mat.length);
        
        for(int i=0;i<mat.length;i++)
            arr.add(new pair(mat[i][c], i));
            
        Collections.sort((p1, p2) -> p1.compareTo(p2));

        int[][] res = new
    }
    */
    public static void main(String[] args) {
//        System.out.println("give me a bottle of rum!");
        problem1();
//         int col = scan.nextInt();
//         problem2(col);
    }
}
