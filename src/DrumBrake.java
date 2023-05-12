public class DrumBrake extends Brakes{
    String name;

    DrumBrake(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drum Brakes: "+ name;
    }
}
