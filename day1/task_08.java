package day1;

import java.util.Scanner;

public class task_08 {
    static void kopaytma(int a) {
        int ming = a / 1000;
        int on = a / 10 % 10;
        System.out.println(ming * on);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        kopaytma(a);
    }
}
