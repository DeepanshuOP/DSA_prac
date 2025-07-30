
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        // int [][] arr = { {1,2,3,10,11}, {4,5,6}, {7,8,9,12,13,14,15} };
    //    System.out.println(arr[1][0]);
       Scanner in=new Scanner(System.in);
        // System.out.println(java.util.Arrays.deepToString(arr));


        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         arr[row][col]=in.nextInt();
        //     }
        // }
        // System.out.println(Arrays.deepToString(arr));

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
        // System.out.println(Arrays.deepToString(arr));
      
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        // Print each row of the array
        // for(int row=0; row<arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for(int[] a: arr){
            System.err.println(Arrays.toString(a));
        }
    }
}
