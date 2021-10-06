package com.company;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = in.nextInt();
        System.out.println("Введите второе число");
        int y = in.nextInt();

        int sum = 0;
        for (int i = 0; i < Math.abs(x); i++) {
            if ((x > 0 && y < 0) || (x < 0 && y > 0)){
                sum = sum - Math.abs(y);
            } else{
                sum = sum + Math.abs(y);
            }
        }
        System.out.println("Result = " + sum);

    }
}
