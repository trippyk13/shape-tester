package shapes;

public class Square extends Rectangle {

    Square (double x) {
        super(x, x);
    }

    public String getName() {
        return "Square";
    }
}
