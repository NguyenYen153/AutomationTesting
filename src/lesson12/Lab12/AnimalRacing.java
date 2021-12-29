package lesson12.Lab12;

import java.util.List;

public class AnimalRacing {
    static Animal winnerAnimal = null;

    public static String getWinnerOfRacing(List<Animal> animalList) {
        for (Animal animal : animalList) {
            if (!animal.performFly()) {
                if (winnerAnimal == null) {
                    winnerAnimal = animal;
                } else {
                    if (animal.getSpeed() >= winnerAnimal.getSpeed()) {
                        winnerAnimal = animal;
                    }

                }
            }
        }
        return "The winner is " + winnerAnimal.getName() + " with speed " + winnerAnimal.getSpeed();
    }
}
