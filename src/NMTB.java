public class NMTB extends MTB{
    public NMTB(Frame frame, Tires tires, Brakes brakes, Shifter shifter, String name) {
        super(frame, tires, brakes, shifter, name);
    }

    @Override
    public String toString() {
        return "Mountain Bike " +"'"+ name + "'\n" +
                "Frame: " + frame +
                ", Tires: " + tires +
                ", " + brakes +
                ", " + shifter;
    }
}
