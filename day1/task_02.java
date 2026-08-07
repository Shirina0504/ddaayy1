package day1;

import java.util.Scanner;
public class task_02 {
    static void perimetr(int a) {
        System.out.println(4 * a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        perimetr(a);
    }
}