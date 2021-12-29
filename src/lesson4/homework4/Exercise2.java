package lesson4.homework4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
      //  String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set your password: ");
        String myPassword = scanner.next();
        int userInputTimes = 0;
        int configTimeInout = 3;
        do {
            System.out.print("Your password is: ");
            String userPass = scanner.next();
            if (userPass.equals(myPassword)){
                System.out.println("Your password is correct");
                break;

            }
            else {
                System.out.println("Incorrect password");
                userInputTimes++;
            }

        } while (userInputTimes <= configTimeInout);
        if (userInputTimes > configTimeInout)
        System.out.printf("You input %d  incorrect password", configTimeInout);

    }
}
