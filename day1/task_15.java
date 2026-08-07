package day1;

import java.util.Scanner;

public class task_15 {
    static void kopaytirma(int a) {
        int ming = a / 1000;
        int yuz = (a / 100) % 10;
        int on = (a / 10) % 10;
        int bir = a % 10;

        System.out.println(ming * yuz * on * bir);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        kopaytirma(a);
    }
}
