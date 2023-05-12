public class Carbon extends Frame{
    String name;

    public Carbon(String color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    public String toString() {
        return color + " Carbon "+ name;
    }
}
