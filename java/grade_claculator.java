/*
Write a program that will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:


Marks        Grade
91-100         AA
81-90          BB
71-80          CC
61-70          DD
<=60           Fail



*/

import java.util.Scanner;

public class grade_claculator {
    public static void main(String[] args) {
        System.out.println("enter num : ");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        gradeclacy(n);
    }

    static void gradeclacy(int n){
        if(n>=91){
            System.out.println("AA");
        } else if (n>=81&&n<91) {
            System.out.println("BB");

        } else if (n>=71&&n<80) {
            System.out.println("CC");

        } else if (n>=61&&n<70) {
            System.out.println("DD");

        } else{
            System.out.println("Fail");
        }
    }



}
