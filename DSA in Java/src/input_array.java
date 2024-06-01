/*
Program to practice input arrays and stuff
 */

import java.util.Arrays;
import java.util.Scanner;

public class input_array {
    public static void main(String[] args) {
        System.out.println("Enter the numbers ");
        Scanner in = new Scanner(System.in);
        int[] arr=new int[5];
       for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
//            System.out.print(arr[i]+" ");
      }
        System.out.println(Arrays.toString(arr));
    }
}
