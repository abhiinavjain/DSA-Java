import java.util.Arrays;

public class passing_in_functions {
    public static void main(String[] args) {
        int[] nums= {3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
       int su= summ(nums,0,1);
        System.out.println(su);
    }
    static int summ(int[] arr, int a, int  b){
        int sum=0;
        for(int i=a; i<=b;i++) {
            sum += arr[i];
        }
        return sum;
    }
}