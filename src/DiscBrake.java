public class DiscBrake extends Brakes{
    String name;

    DiscBrake(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rim Brakes: "+ name;
    }
}
