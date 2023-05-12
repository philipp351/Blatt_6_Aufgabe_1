public class EMTB extends MTB{
    public EMTB(Frame frame, Tires tires, Brakes brakes, Shifter shifter, String name) {
        super(frame, tires, brakes, shifter, name);
    }

    @Override
    public String toString() {
        return "Electric Mountain Bike " +"'"+ name + "'\n" +
                "Frame: " + frame +
                ", Tires: " + tires +
                ", " + brakes +
                ", " + shifter;
    }
}
