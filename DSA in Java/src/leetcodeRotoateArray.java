import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcodeRotoateArray {
    public static void main(String[] args) {
        Integer nums[]= {1,2,3,4,5,6,7};

        Collections.reverse(Arrays.asList(nums));

//        int ln=nums.length;
//
//        List li= Arrays.asList(nums);
//
//        li.add(0, nums[ln-1]);
//        for(int i=1;i<=3;i++){
//            nums[0]=nums[ln-1];
//        }
//
//        for(int i=0;i<ln;i++){
//            System.out.print(nums[i]+" ");
//        }
//
//        System.out.println(nums);

        System.out.println(Arrays.toString(nums));


    }
}
