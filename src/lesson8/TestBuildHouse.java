package lesson8;
import static  lesson8.House.Builder;

public class TestBuildHouse {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.withMainDoorNumber(3);
        builder.withColor("blue");
        builder.withTopRoofColor("yellow");

        // imutale object
        House house = builder.build();
        System.out.println(house.getMainDoorNumber());
        System.out.println(house.getColor());
        System.out.println(house.getTopRoofColor());
    }
}
