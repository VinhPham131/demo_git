package thayTai.Cau2_Test;

public class Person {
    private String name;
    private int age;
    private String sex;
    Person (String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }
}
