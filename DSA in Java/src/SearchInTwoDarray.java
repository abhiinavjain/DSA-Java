import java.util.Arrays;

public class SearchInTwoDarray {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,56,45},
                {8,7,6,5,4,7,2,}
        };
        int target=99;
        int[] ans=search(arr,target);

        System.out.println(Arrays.toString(ans) );

    }

    static int[] search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};

    }
}
