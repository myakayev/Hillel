/**
 * The class "Pizza" is needed for creation objects, which describe pizza. An object of this class has such fields as
 * Circle basis, String composition, String name, int cost. When object of this class is creating user should set
 * "name", "composition", "cost" and "diameter" of pizza.
 *
 * Author: Oleksandr Miakaiev.
 */
public class Pizza {
    Circle basis;
    String composition;
    String name;
    int cost;

    public Pizza(String name, String composition, int cost, double diameter) {
        this.composition = composition;
        this.name = name;
        this.cost = cost;
        this.basis = new Circle(diameter / 2, "white");
    }

    public void infoPizza() {
        System.out.println("Name - " + this.name + ";\ncomposition - " + this.composition + ";\ncost - " + this.cost +
                ";\n additional information: \n color of dough - " + this.basis.color + ";\n circle length - " +
                this.basis.l + "\nradius of circle is " + this.basis.radius + ";\n square of circle is - " +
                this.basis.square + ".\n :)");
    }

}
