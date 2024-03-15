package thayTai.Cau3_Test;

import java.util.Scanner;

public class ThiSinh {
    Scanner sc = new Scanner(System.in);
    private String name;
    private double math, physic, chemistry;
    ThiSinh(String name, double math, double physic, double chemistry) {
        this.name = name;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMath(double math) {
        this.math = math;
    }
    public double getMath() {
        return math;
    }
    public void setPhysic(double physic) {
        this.physic = physic;
    }
    public double getPhysic() {
        return physic;
    }
    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    public double getChemistry() {
        return chemistry;
    }
    public void inputInfo() {
       
    }
    public double calculate() {
        return math + chemistry + physic;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Total grade: " + calculate());
    }
}
