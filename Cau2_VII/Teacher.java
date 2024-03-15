package thayTai.Cau2_VII;

public class Teacher extends Person {
    double salary;
    Teacher(double salary, String name , int age, String gender) {
        super(name, age, gender);
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
