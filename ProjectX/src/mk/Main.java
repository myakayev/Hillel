package mk;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Kolia", 15);
        Human human2 = new Human("Kolia", 15);
        System.out.println(human1.equals(human2));
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human1.toString());
    }

}

