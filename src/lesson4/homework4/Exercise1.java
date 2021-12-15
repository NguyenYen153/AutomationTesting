package lesson4.homework4;

public class Exercise1 {
    public static void main(String[] args) {
        String givenString =  "2hrs and 5 minutes";
        String[] hourPart = givenString.split("hrs and| hr and");
        float hour = Float.parseFloat(hourPart[0]);
        String[] minutesPart = hourPart[1].split("minutes | minute" );
        float minutes = Float.parseFloat(minutesPart[0]);
        System.out.println(hour*60 + minutes);
    }
}
