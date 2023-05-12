public class Alu extends Frame {
    String name;

    public Alu(String color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    public String toString() {
        return color + " Aluminium "+ name;
    }
}
