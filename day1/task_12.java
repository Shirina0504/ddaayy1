package day1;

import java.util.Scanner;

public class task_12 {
    static void yuzlar( int a) {
        System.out.println(a / 100);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        yuzlar(a);
    }

}
