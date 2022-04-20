package Task2;

public class GlobalRating {
    static Score[] data;
    static {
        data = new Score[4];
        data[0] = new Score();
        data[1] = new Score();
        data[2] = new Score();
        data[3] = new Score();
        data[0].category = "views";
        data[1].category = "actions";
        data[2].category = "sharings";
        data[3].category = "buyings";
    }
}
