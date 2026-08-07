package day1;

import java.util.Scanner;

public class task_13 {
    static void almashtirish(int a) {
        int yuz = a / 100;
        int qogani = a % 100;

        System.out.println(qogani * 10 + yuz);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        almashtirish(a);
    }
}
