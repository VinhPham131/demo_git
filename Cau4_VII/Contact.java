package thayTai.Cau4_VII;


public class Contact {
    String name;
    String phone;
    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  String getName() {
        return name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
    public String toString() {
        return name + " - " + phone;

    }
}
