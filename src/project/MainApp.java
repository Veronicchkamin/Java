package project;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++ ) {
            sum = sum +i;
            System.out.println("sum: " + sum);
        }

        System.out.println("close");
        System.out.println("close");

    }

}
