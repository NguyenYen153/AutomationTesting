package lesson12.DesignParternLearning;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm mute");
    }
}
