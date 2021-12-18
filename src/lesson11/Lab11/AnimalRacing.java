package lesson11.Lab11;

import java.util.*;

public class AnimalRacing {
    static Map<Animal,Double> animalRacingMap = new HashMap<>();
    public static String getWinnerOfRacing(Map<Animal, Double> animalMap){
        for(Animal animal : animalMap.keySet()){
            if (!animal.IsFlyAble()){
                animalRacingMap.put(animal, animal.getSpeed());
            }
        }
        //Sorting MAP by speed max -> min

        List<Map.Entry<Animal, Double>> resultList =  new ArrayList<>(animalRacingMap.entrySet());
        resultList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        //System.out.println(resultList);

        //Get first element
        Map.Entry<Animal, Double> entry = animalRacingMap.entrySet().iterator().next();
        String winner = entry.getKey().getName();
        double winnerSpeed = entry.getValue();
       // System.out.println("The winner is " + winner + " with speed " + winnerSpeed);
        return "The winner is " + winner + " with speed " + winnerSpeed;
}
}
