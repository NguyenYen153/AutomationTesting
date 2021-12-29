package lesson13;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Num 1:");
        int num1 = scaner.nextInt();
        System.out.println("Num 2:");
        int num2 = scaner.nextInt();
//HANDLE exception
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (Exception e ){
            //e.printStackTrace();
            System.out.println("Error");
        } finally {// CO loi hay khong co loi van xay ra: try -finally ->except
            System.out.println("End!");
        }

    }
}
