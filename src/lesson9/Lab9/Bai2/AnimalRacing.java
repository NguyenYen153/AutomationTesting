package lesson9.Lab9.Bai2;

import lesson9.Lab9.Bai2.Dog;
import lesson9.Lab9.Bai2.Horse;
import lesson9.Lab9.Bai2.Tiger;

public class AnimalRacing {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(100);
        Horse horse = new Horse(75);
        Dog dog = new Dog(60);
        if(dog.getSpeed() >= horse.getSpeed() && dog.getSpeed() >= tiger.getSpeed()){
            System.out.println("The winner is " + dog.getClass().getSimpleName() + " with speed " + dog.getSpeed());
        } else if(horse.getSpeed() >= dog.getSpeed() && horse.getSpeed() >= tiger.getSpeed() ){
            System.out.println("The winner is " + horse.getClass().getSimpleName() + " with speed " + horse.getSpeed());
        }else{
            System.out.println("The winner is " + tiger.getClass().getSimpleName() + " with speed " + tiger.getSpeed());
        }
    }

}
