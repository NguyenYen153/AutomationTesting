package lesson4.homework4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your string: ");
        String userString = scanner.nextLine();
        char [] charArrOfUserInput = userString.toCharArray();
        StringBuilder stringNumber = new StringBuilder();
        for (char character : charArrOfUserInput){
            if( Character.isDigit(character)) {
                stringNumber.append(character);

            }
        }
        System.out.print(stringNumber);


    }
}
