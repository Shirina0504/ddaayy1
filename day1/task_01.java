package day1;

import java.util.Scanner;
public class task_01 {
     static void Arifmetik(double a, double b, double c) {
         System.out.println( (a + b + c) / 3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Arifmetik(a, b, c);
    }
}