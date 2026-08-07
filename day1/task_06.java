package day1;

import java.util.Scanner;
public class task_06 {
    static void kvadrat(int a) {
        System.out.println(a * a);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        kvadrat(a);
    }
}
