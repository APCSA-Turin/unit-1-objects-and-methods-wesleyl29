public class Circle {

    private final double radius;

    public Circle(double radius1){
        radius = radius1;
    }

    public void areaCalculator() {
        System.out.println("A circle with radius " + radius + " has an area of " + (radius * radius * Math.PI));
    }

}
