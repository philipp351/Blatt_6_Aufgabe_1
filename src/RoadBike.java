public class RoadBike extends Bike {
    public RoadBike(Frame frame, Tires tires, Brakes brakes, Shifter shifter, String name) {
        super(frame, tires, brakes, shifter, name);
    }

    @Override
    public String toString() {
        return "Road Bike " +"'"+ name + "'\n" +
                "Frame: " + frame +
                ", Tires: " + tires +
                ", " + brakes +
                ", " + shifter;
    }
}
