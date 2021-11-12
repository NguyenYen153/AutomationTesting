package lesson2;

import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String notificationStr = "";
        notificationStr = inputNumber == 3 ? "You input number 3" : "This isn't number 3";
        System.out.println(notificationStr);
    }
}
