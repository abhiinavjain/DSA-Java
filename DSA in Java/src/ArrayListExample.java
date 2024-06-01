
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(69);
        list.add(677);
        list.add(60);
        list.add(65);

        Scanner in = new Scanner(System.in);

        for(int i =0;i<5;i++){
            list.add(in.nextInt());
        }

        System.out.println(list);
        list.set(0,85);
        System.out.println(list);
        System.out.println(list.contains(55));
    }
}
