import static java.lang.Math.pow;

/**
 * The class "Circle" describes a basis for future pizza. When object of this class is creating user can set radius
 * or radius and color of circle in constructor. The length of circle and square will be calculated.
 *
 * Author: Oleksandr Miakaiev.
 */
public class Circle {
    double radius;
    double l;
    double square;
    String color;

    public Circle(double radius) {
        this.radius = radius;
        this.square = Math.PI * pow(radius, 2);
        this.l = 2 * Math.PI * radius;
    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void infoCircle() {
        System.out.println("The square of circle is " + this.square);
        System.out.println("The circle length is " + this.l);
        System.out.println("The color of circle is " + this.color + "\n");
    }

}
