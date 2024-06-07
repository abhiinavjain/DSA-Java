public class CountEvenDigits {
    public static void main(String[] args) {
        int ans=countdig(4567);
        System.out.println(ans);
    }

    static int countdig(int n){
        int count=0;
        while(n>=0){
            n= n/10;
            count++;
        }

        return count;

    }
}
