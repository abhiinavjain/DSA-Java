
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        System.out.println("enter array ");
        Scanner in = new Scanner(System.in);
        int arr[][]= new int[3][4];
        for(int i=0;i<arr.length;i++){
            for(int col=0;col<arr[i].length;col++){
                arr[i][col]=in.nextInt();
            }
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }

    }
}
