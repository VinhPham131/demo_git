package thayTai.Cau2_VII;

public class Student extends Person {
    String className;
    double average;

    public Student(String className, double average, String name, int age, String gender) {
        super(name, age, gender);
        this.className = className;
        this.average = average;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getClassName() {
        return className;
    }
    public void setAverage(double average) {
        this.average = average;
    }
    public double getAverage() {
        return average;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Class name: " + className);
        System.out.println("Average grade: " + average);
    }
    }
    
