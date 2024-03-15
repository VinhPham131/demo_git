package thayTai.Cau1_Test;

public class main {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        System.out.println(c.toString());
        Rectangle r = new Rectangle(10, 5);
        System.out.println(r.toString());
        Rectangle[] rectList = new Rectangle[10];
        for(int i = 0; i < rectList.length; i++) {
            double w = 100*Math.random();
            double h = 100*Math.random();
            rectList[i] = new Rectangle(w, h);
            System.out.println(rectList[i].toString());
        }
    }
}

