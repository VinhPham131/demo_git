package thayTai.Cau1_VII;

import java.util.Arrays;

class main {
    public static void main(String[] args) {
    Circle c1 = new Circle(5);
    System.out.println(c1.toString());
    Rectangle r1 = new Rectangle(5, 6);
    System.out.println( r1.toString());
    Rectangle[] rectangles = new Rectangle[10];
    for(int i = 0; i < 10; i++) {
        double w = 100 * Math.random();
        rectangles[i] = new Rectangle(w, w);
        rectangles[i].toString();
    }
    Rectangle []rectList = new Rectangle[10]; 
    for(int i = 0; i < rectList.length; i++) {
         double w = 100*Math.random(); 
         double h = 100*Math.random(); 
         rectList[i] = new Rectangle(w, h); 
        }
        Arrays.sort(rectList); 
        for(int i = 0; i < rectList.length; i++) { 
            System.out.println(rectList[i].toString()); 
        }
}
}

