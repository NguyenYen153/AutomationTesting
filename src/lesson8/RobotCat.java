package lesson8;

public class RobotCat {
    //Contructor k co doi so - default, co method Overloading
    // Neu tao contructor khác thi goi contructor default se loi
    private String name;//attribute value of object
    private String year;// Khong truy cap duoc ngoai class

    public RobotCat(String name, String year) {
        this.name = name;
        this.year = year;
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

    //Service method
    public  void run(){
        System.out.println("Robot is running");
    }
    //Support method
    private void doSthInside(){

    }
    //Implement read Only: Only Getter

    //Implement write only Setter
}
