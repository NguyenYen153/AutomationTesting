package lesson8.homework8;

public class AnimalRacing {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Horse horse = new Horse();
        Dog dog = new Dog();
        if(dog.getSpeed() >= horse.getSpeed() && dog.getSpeed() >= tiger.getSpeed()){
            System.out.println("The winner is " + dog.getClass().getSimpleName() + " with speed " + dog.getSpeed());
        } else if(horse.getSpeed() >= dog.getSpeed() && horse.getSpeed() >= tiger.getSpeed() ){
            System.out.println("The winner is " + horse.getClass().getSimpleName() + " with speed " + horse.getSpeed());
        }else{
            System.out.println("The winner is " + tiger.getClass().getSimpleName() + " with speed " + tiger.getSpeed());
        }
    }

}
