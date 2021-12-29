package lesson2;

import java.util.Scanner;

public class MultipleIfElse {
        public static void main(String[] args) {
            //Age enough to buy beer
            Scanner scanner = new Scanner(System.in);
            System.out.print("Age: ");
            int userAge = scanner.nextInt();
            if(userAge < 18)
                System.out.println("Không bán");
            else if (userAge <= 55) // userAge >= 18 && userAge <= 55
                System.out.println("Bao nhiêu cũng bán");
            else
                System.out.println("2 chai");
        }
}

