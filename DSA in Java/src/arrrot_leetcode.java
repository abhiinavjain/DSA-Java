public class arrrot_leetcode {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        reversearr(nums,nums.length);
        System.out.println(nums);

    }

    static int[] reversearr(int[] a, int n){
        int i;
        int t;

        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        return  a;
    }

}
