package lesson7;

public class RobotCat {
    //Contructor k co doi so - default, co method Overloading
    // Neu tao contructor khác thi goi contructor default se loi
    private String name;//attribute value of object

    public RobotCat(String name) {
        this.name = name;
    }

    //Getters - return object attribute value
    public String getName() {
        return this.name;
    }
    //Setter - Set onject attributr value (Đã được sinh ra
    public void setName(String name){
        this.name = name;
    }
    //Alt + Insert - Generate nhanh contructier
}
