package lesson3;
import  java.security.SecureRandom;
import java.util.Scanner;


public class DoWhileLoop {
    public static void main(String[] args) {
        int tryTimes = 0;
        final int MAX_TRY_TIMES = 3; // Khong thay đoi
        int [] myIntArr = {0,3,1,5,8,9,12,10,7,21};
        int randomIndex = new SecureRandom().nextInt(myIntArr.length);
        int randomNumber = myIntArr[randomIndex];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Your number: ");
            int userNumber = scanner.nextInt();
            if (userNumber == randomNumber){
                System.out.println("You win!");
                break;
            }
            tryTimes++;

        } while (tryTimes < MAX_TRY_TIMES);
        System.out.println("See you next time!");

    }
}
