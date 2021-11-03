package lesson1;

public class VariablesInJava {
    public static void main (String[] argv) {
        System.out.println("Hello Word");
        String name = "Yen";
        int height  = 159;// in centimeter
        float heightInMeter = (float) height / 100;
        int weight = 50;
        float BMI = (float) weight / (heightInMeter*heightInMeter);
        System.out.println("Hello" + name);
        System.out.printf("Your BMI is %f\n", BMI);
        boolean isBMIsNormal =  (BMI <= 24 && BMI >= 20);
        System.out.printf("Is my BMI is normal: %b", isBMIsNormal);

    }
}
