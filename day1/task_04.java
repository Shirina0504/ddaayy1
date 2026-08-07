package day1;

import java.util.Scanner;
public class task_04 {
    static void kub(int a) {
        System.out.println(a * a * a);
        System.out.println(6 * a * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        kub(a);
    }
}