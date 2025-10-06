package U1T6_Return;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10,20);
        rect1.printArea();
        rect1.printBoxVolume(30.75);
        rect1.printBoxVolume(40.5);
        System.out.println("Area = "+rect1.calculateArea()+", Volume = "+rect1.calculateBoxVolume(25.0));
    }
}