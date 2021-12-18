package lesson11.Lab11;

import java.util.HashMap;
import java.util.Map;

public class AnimalRacingTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger");
        Falcon falcon = new Falcon("Falcon");
        Dog dog = new Dog("Dog");
        Horse horse = new Horse("Horse");
        Eagle eagle = new Eagle("Eagle");
        Map<Animal, Double> animalDoubleMap = new HashMap<>();
        animalDoubleMap.put(tiger, tiger.getSpeed());
        animalDoubleMap.put(falcon, falcon.getSpeed());
        animalDoubleMap.put(dog, dog.getSpeed());
        animalDoubleMap.put(horse, horse.getSpeed());
        animalDoubleMap.put(eagle, eagle.getSpeed());
        String answer = AnimalRacing.getWinnerOfRacing(animalDoubleMap);
        System.out.println(answer);
    }

}
