public class HubGear extends Shifter{
    String name;
    public HubGear(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hub Gear: " + name;
    }
}
