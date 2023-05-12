public class ECityBike extends CityBike{
    public ECityBike(Frame frame, Tires tires, Brakes brakes, Shifter shifter, String name) {
        super(frame, tires, brakes, shifter, name);
    }

    @Override
    public String toString() {
        return "Electric City Bike " +"'"+ name + "'\n" +
                "Frame: " + frame +
                ", Tires: " + tires +
                ", " + brakes +
                ", " + shifter;
    }
}
