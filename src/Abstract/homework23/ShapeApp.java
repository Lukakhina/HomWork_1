package Abstract.homework23;

public class ShapeApp {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(6,5);
        Triangle triangle = new Triangle(6,8,4);


        Shape [] shapes = new Shape[3];
        circle.getArea();
        rectangle.getArea();
        triangle.getArea();

        System.out.println("Площадь  " + shapes );
        System.out.println("ПЕРИМЕТЕР " );
    }


}
