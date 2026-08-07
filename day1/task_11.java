package day1;

import java.util.Scanner;

public class task_11 {
    static void metr(int L) {
        System.out.println(L / 100);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        metr(L);
    }
}
