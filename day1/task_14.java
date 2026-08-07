package day1;

import java.util.Scanner;

public class task_14 {
    static void teskari(int a) {
        int yuz = a / 100;
        int on = (a / 10) % 10;
        int bir = a % 10;

        System.out.println(bir * 100 + on * 10 + yuz);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        teskari(a);
    }
}
