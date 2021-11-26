package lesson6;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RandomClassMember {


    //One source OF truth | in memory storage
    private static Map<String, String> classMembers = new HashMap<>();
    private static Map<String, String> randomMembers = new HashMap<>();
    private static Map<String, String> remanningMembers = new HashMap<>();
    public static void main(String[] args) {
        classMembers.put("001", "Tuan Pham Le");
        classMembers.put("002", "Pham Thi Bich Uyen");
        classMembers.put("003", "Nguyen Thi Yen");
        classMembers.put("004", "Dieu Ai Le");
        classMembers.put("005", "Nhu Le");
        classMembers.put("006", "Dao Thi Quyen");
        classMembers.put("007", "Nguyen Thi Van Anh");
        classMembers.put("008", "TRan Dang Bao");
        classMembers.put("009", "Mi Nguyen");
        classMembers.put("010", "Thanh Nguyen");
        classMembers.put("011", "Vo Hong Phuong");
        classMembers.put("012", "Tran Quoc Hoang");


        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students don't attend in our class?");
        int missingNumber = scanner.nextInt();
        String [] inputStudentKey = new String[missingNumber] ;
        System.out.println("Student doesn't attend in our class");
        for (int i = 0; i < missingNumber ; i++){
            inputStudentKey[i] = scanner.next();
        }
        //Test missing members
        updateMissingMember(inputStudentKey);
        //Assign remaining members
        resetRemaningMembers();

        boolean isContinuing = true;
        while (isContinuing) {

            System.out.println("============PICK UP RANDOM STUDENT==========");
            System.out.println("1. PICK UP");
            System.out.println("0. Exit");
            System.out.print("Your option is: ");
            int userOptionNumber = scanner.nextInt();



            switch (userOptionNumber) {
                case 1:
                    //Pick up random
                    pickRandomMember();
                    break;
                case 0:
                    isContinuing = false;
                    System.out.println("Enjoy your lesson!!!");
                    break;
                default:
                    System.out.println("Wrong option.Please choose again!");
                    break;
            }

        }

    }
    public static void pickRandomMember(){
        if (remanningMembers.isEmpty()){
            resetRemaningMembers();
            resetRandomMembers();
        }
        //pick a member from current class members
        Set<String> allStudentKeys = remanningMembers.keySet();
        Object[] allStudentKeyArr = allStudentKeys.toArray();

        int remainingMemberNum = allStudentKeyArr.length;
        int randomStudentKeyIndex = new SecureRandom().nextInt(remainingMemberNum);
        String randomStudentKey = (String) allStudentKeyArr[randomStudentKeyIndex];
        String randomMemberName = remanningMembers.get(randomStudentKey);
        System.out.printf(" We got %s | %s\n", randomStudentKey, randomMemberName);

        //Update random list which contains members in previous time | add
        //update current | remove
        remanningMembers.remove(randomStudentKey);
        randomMembers.put(randomStudentKey,randomMemberName);
    }
    //Support method
    private static void resetRandomMembers(){
        //Garbage collector
        randomMembers = new HashMap<>();
    }
    //Service method
    public static void resetRemaningMembers() {
        for (String studentKey : classMembers.keySet()){
            remanningMembers.put(studentKey, classMembers.get(studentKey));
        }
    }

    public static void updateMissingMember(String [] studentKey) {
        for (String key : studentKey) {
            if (classMembers.containsKey(key)) {
                classMembers.remove(key);
                //System.out.println(classMembers);
            } else
                System.out.printf("There is no such as student %s\n", key);
        }
    }

}

