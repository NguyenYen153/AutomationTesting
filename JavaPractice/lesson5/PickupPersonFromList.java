package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickupPersonFromList {
    public static void main(String[] args) throws IOException {
        List<String> memberOfClass = new ArrayList<>();
        memberOfClass.add("Tuan Pham Le");
        memberOfClass.add("Pham Thuy Bich Uyen");
        memberOfClass.add("Nguyen Thi Yen");
        memberOfClass.add("Dieu Ai Le");
        memberOfClass.add("Nhu Le");
        memberOfClass.add("Nguyen Trinh Tung");
        memberOfClass.add("Nguyen Thi Van Anh");
        memberOfClass.add("Tran Dang Bao");
        memberOfClass.add("Thanh Nguyen");
        memberOfClass.add("Mi Nguyen");
        memberOfClass.add("Vo Hong Phuong");
        memberOfClass.add("Tran Quoc Phong");
        List<String> studentLeft = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students don't attend in class?");
        int numberLeftStudent = scanner.nextInt();
        //System.out.println("Enter full name of left Students");
        String[] leftStudents = new String[numberLeftStudent];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < numberLeftStudent; i++){
            System.out.println("Enter name of left students : "+ (i + 1));
            leftStudents[i] = bufferedReader.readLine();
        }
       for (String name : memberOfClass) {
             //memberOfClass.remove(bufferedReader.readLine());
           for ( int i = 0; i < numberLeftStudent; i++) {
               if (leftStudents[i].equals(name))
                   memberOfClass.remove(name);
           }

        }
        System.out.println("Members of class");
        for (String name: memberOfClass){
            System.out.println(name);
        }

        int numberAttendedStudents = 12 - numberLeftStudent;
        int randomIndex = new SecureRandom().nextInt(numberAttendedStudents);
        System.out.println("Hero of this game is: "+ memberOfClass.get(randomIndex));
    }
}