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
        System.out.printf("Is my BMI is normal: %b\n", isBMIsNormal);
        /*
        prefix
        calculate
        assignment
        postfix
         */
        // Chia lay phan nguyen
        int a = 7/3;
        int b = 7%3;
        int d = 5;
        int e = 6;

        int c;
        c = ++d + e++;
        System.out.println(c);


    }
}
