package thayTai.Cau2_Test;

public class Teacher extends Person{
    private double salary;
    Teacher(String name, int age, String sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: " + salary);
    }
}
