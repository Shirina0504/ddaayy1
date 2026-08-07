package day1;

import java.util.Scanner;

public class task_07 {
    static void $(double a) {
        System.out.println(a / 11200);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        $(a);
    }
}
