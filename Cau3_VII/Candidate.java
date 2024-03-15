package thayTai.Cau3_VII;

public class  Candidate {
    String name;
    double math, phisic, chemistry;
    Candidate(String name, double math, double phisic, double chemistry) {
        this.name = name;
        this.math = math;
        this.phisic = phisic;
        this.chemistry = chemistry;
    }
    public void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    public void setMath(double math) {
        this.math = math;
    }
    double getMath() {
        return math;
    }
    public void setPhisic(double phisic) {
        this.phisic = phisic;
    }
    double getPhisic() {
        return phisic;
    }
    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    double getChemistry() {
        return chemistry;
    }
    public double calculateTotal() {
        return math + phisic + chemistry;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Total grade: " + calculateTotal());
    }
}
