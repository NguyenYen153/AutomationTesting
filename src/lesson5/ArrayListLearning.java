package lesson5;

import java.util.*;

public class ArrayListLearning {
    //Collections List Map Set
    public static void main(String[] args) {
        //Declaaration
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);
        //RemoveAll

        List<Integer> withOutDuplicatedList = new ArrayList<>();
        for (Integer number : myArrList) {
            if (withOutDuplicatedList.isEmpty()) {
                withOutDuplicatedList.add(number);
                if (withOutDuplicatedList.contains(number)) {
                    withOutDuplicatedList.add(number);

                }
            }
        }
        //Set
        Set<Integer> set = new HashSet<>(myArrList);
        List<Integer> withOutDuplicatedList2 = new ArrayList<>(set);
        for (Integer number : withOutDuplicatedList2){
            System.out.println(number);
        }
        //Sort
        Collections.sort(withOutDuplicatedList2);//Ascending;
        List<Integer> targetArrList = withOutDuplicatedList2.subList(0,2); //2 nd parameter EXCLUSIVE

    }
}
