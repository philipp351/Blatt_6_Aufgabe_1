public class NCityBike extends CityBike{
    public NCityBike(Frame frame, Tires tires, Brakes brakes, Shifter shifter, String name) {
        super(frame, tires, brakes, shifter, name);
    }

    @Override
    public String toString() {
        return "City Bike " +"'"+ name + "'\n" +
                "Frame: " + frame +
                ", Tires: " + tires +
                ", " + brakes +
                ", " + shifter;
    }
}
