package lesson8;

//Buider Design Pattern
//object dc sinh ra vs bo data khac nhau
public class House {
    private int mainDoorNumber;
    private String color = "white";
    private String topRoofColor = "red";

    //Solution is not good, is not used
//    public House (int mainDoorNumber, String color , String topRoofColor){
//        if (mainDoorNumber > 1)
//            this.mainDoorNumber = mainDoorNumber;
//        if (null != color){
//            this.color = color;
//        }
//        if (null != topRoofColor){
//            this.topRoofColor = topRoofColor;
//        }
//    }
    //Read only
    private House (Builder builder){
        mainDoorNumber = builder.mainDoorNumber;
        color = builder.color;
        topRoofColor = builder.topRoofColor;
    }

    public int getMainDoorNumber() {
        return mainDoorNumber;
    }

    public String getColor() {
        return color;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    // Write only | Inner class
    public  static class Builder{
        private  int mainDoorNumber;
        private  String color;
        private String topRoofColor;

        public Builder(){

        }

        public void withMainDoorNumber(int mainDoorNumber) {
            this.mainDoorNumber = mainDoorNumber;
        }

        public void withColor(String color) {
            this.color = color;
        }

        public void withTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
        }
        public House build(){
            return new House(this);
        }
    }

}
