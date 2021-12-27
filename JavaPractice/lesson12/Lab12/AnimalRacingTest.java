package lesson12.Lab12;

import lesson12.DesignParternLearning.FlyNoWay;
import lesson12.DesignParternLearning.FlyWithWings;

import java.util.*;

public class AnimalRacingTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(100, "Tiger");
        Falcon falcon = new Falcon(40, "Falcon");
        Dog dog = new Dog(60, "Dog");
        Horse horse = new Horse(75, "Horse");
        Eagle eagle = new Eagle(60, "Eagle");
        List<Animal> animalRacingList = Arrays.asList(tiger, falcon, dog, horse, eagle);

        String answer = AnimalRacing.getWinnerOfRacing(animalRacingList);
        System.out.println(answer);
    }

}
