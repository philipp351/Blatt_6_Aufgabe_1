public class RimBrakes extends Brakes{
    String name;

    RimBrakes(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rim Brakes: "+ name;
    }
}
