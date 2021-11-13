package lesson3;

import java.security.SecureRandom;
import java.util.Scanner;

public class MenuWithWhileLoop {
    public static void main(String[] args) {
        /* ============Awesome Program ==========
        1/ Check Odd, Even Number
        2/ GuessingNumber
        3.
         */
        int falseAttemp = 0;
        boolean isContinueing = true;
        while (isContinueing) {
            if (falseAttemp == 3) {
                System.out.println("Exceed try times");
                break;
            }
            System.out.println("============Awesome Program ==========");
            System.out.println("1. Check is number Odd or Even");
            System.out.println("2. GuessingNumber");
            System.out.println("3. Check is number Prime");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your option is: ");
            int userOptionNumber = scanner.nextInt();

            switch (userOptionNumber) {
                case 1:
                    checkOddEvenNumber();
                    break;
                case 2:
                    guessingNumber();
                    break;
                case 3:
                    checkPrimeNUmber();
                    break;
                case 0:
                    isContinueing = false;
                    break;
                default:
                    falseAttemp += 1;
                    System.out.println("Wrong option.Please choose again!");
                    break;

            }


        }
        System.out.println("Hẹn lại bạn lần sau!");
    }

    private static void checkPrimeNUmber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your integer number: ");
        int userNumber = scanner.nextInt();
        int countDivisor = 0;
        for( int divisor = 2; divisor <= Math.sqrt(userNumber); divisor++){
            if (userNumber % divisor == 0)
                countDivisor++;
        }

        if (countDivisor == 0 && userNumber >= 2)
            System.out.printf("%d is Prime number\n", userNumber);
        else
            System.out.printf("%d isn't Prime number\n",userNumber);
    }

    private static void guessingNumber() {
        int tryTimes = 0;
        final int MAX_TRY_TIMES = 3; // Khong thay đoi
        int[] myIntArr = {0, 3, 1, 5, 8, 9, 12, 10, 7, 21};
        int randomIndex = new SecureRandom().nextInt(myIntArr.length);
        int randomNumber = myIntArr[randomIndex];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Choose one of these numbers");
            for (int index = 0; index < myIntArr.length; index++) {
                System.out.println(myIntArr[index]);
            }
            System.out.print("Your number: ");
            int userNumber = scanner.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("You win!");
                break;
            }
            tryTimes++;

        } while (tryTimes < MAX_TRY_TIMES);
        System.out.println("See you next time!");


    }

    private static void checkOddEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your integer number: ");
        int intInputNum = scanner.nextInt();
        String isOddOrEven = "";
        isOddOrEven = ((intInputNum) % 2 == 0) ? " là số chẵn" : " là số lẻ";
        System.out.println(intInputNum + isOddOrEven);
    }
}


