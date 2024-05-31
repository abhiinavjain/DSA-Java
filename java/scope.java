public  class scope{
    static int x=10;
    public static void main(String[] args) {
        System.out.println(x);
        x=50;
        System.out.println(x);
    }
}