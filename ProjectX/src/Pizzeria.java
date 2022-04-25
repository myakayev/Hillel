/**
 * This class is needed for creation pizzas or basis for pizza.
 * <p>
 * Author: Oleksandr Miakaiev.
 */

public class Pizzeria {
    public static void main(String[] args) {
        Circle circle1 = new Circle(50.0);
        circle1.setColor("white");
        Circle circle2 = new Circle(30.23, "black");
        circle1.infoCircle();
        circle2.infoCircle();
        Pizza[] pizzas = new Pizza[4];
        pizzas[0] = new Pizza("Americana", "dough, cheese, meat", 100, 60.0);
        pizzas[1] = new Pizza("Hawaii", "dough, cheese, pine-apples", 90, 45.0);
        pizzas[2] = new Pizza("Margherita", "dough, cheese, tomatoes", 60, 30.0);
        pizzas[3] = new Pizza("Carbonara", "dough, cheese, eggs, bacon", 200, 100.0);

        for (Pizza pizza : pizzas) {
            pizza.infoPizza();
        }
    }
}

