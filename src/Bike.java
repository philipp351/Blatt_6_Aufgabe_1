public class Bike {
    Frame frame;
    Tires tires;
    Brakes brakes;
    Shifter shifter;
    String name;

    public Bike(Frame frame, Tires tires, Brakes brakes, Shifter shifter, String name) {
        this.frame = frame;
        this.tires = tires;
        this.brakes = brakes;
        this.shifter = shifter;
        this.name = name;
    }

    // Methoden
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }



}
