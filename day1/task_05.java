package day1;

import java.util.Scanner;
public class task_05 {
    static void almashtirish(int a, int b, int c) {
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        almashtirish(a, b, c);
    }
}