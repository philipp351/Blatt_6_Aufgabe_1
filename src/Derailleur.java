public class Derailleur extends Shifter{
    String name;
    public Derailleur(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Derailleur: " + name;
    }
}
