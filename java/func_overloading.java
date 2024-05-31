public class func_overloading {
    // there is no error when two functions have same name but different arguments

    public static void main(String[] args) {
        fun(1);
        fun(10,30);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int a, int b){
        System.out.println(a+b);
    }
}
