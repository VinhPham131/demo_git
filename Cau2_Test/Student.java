package thayTai.Cau2_Test;

public class Student extends Person {
    private String className;
    private double average;
    Student(String name, int age, String sex, String className, double average) {
        super(name, age, sex);
        this.average = average;
        this.className = className;
    }
    public void setClassname(String className)  {
        this.className = className;
    }
    public String getClassname() {
        return className;
    }
    public void setAverage(double average) {
        this.average = average;
    }
    public double getAverage() {
        return average;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Class name: " + className);
        System.out.println("Average grades: " + average);
    }
}
