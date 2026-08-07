package day1;

import java.util.Scanner;

public class task_10 {
    static  void daraja(int a) {
        int a2 = a * a;
        int a4 = a2 * a2 * a2;
        int a7 = a4 * a;
        System.out.println(a7);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        daraja(a);
    }
}
