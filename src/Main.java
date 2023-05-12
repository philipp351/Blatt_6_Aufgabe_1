public class Main {
    public static void main(String[] args) {
        Frame UllrichFrame = new Alu("pink", "Pinarello");
        Tires UllrichTires = new Tires("Continental Slim");
        Brakes UllrichBrakes = new RimBrakes("Campagnolo");
        Shifter UllrichShifter = new Derailleur("Campagnolo");
        Bike UllrichBike = new RoadBike(UllrichFrame, UllrichTires, UllrichBrakes, UllrichShifter, "Jan Ullrich");
        System.out.println(UllrichBike + "\n");

        Frame ArmstrongFrame = new Carbon("red", "Trek");
        Tires ArmstrongTires = new Tires("Continental Slim");
        Brakes ArmstrongBrakes = new RimBrakes("SRAM");
        Shifter ArmstrongShifter = new Derailleur("SRAM");
        Bike ArmstrongBike = new RoadBike(ArmstrongFrame, ArmstrongTires, ArmstrongBrakes, ArmstrongShifter, "Lance Armstrong");
        System.out.println(ArmstrongBike + "\n");

        Frame PantaniFrame = new Alu("black", "Giant");
        Tires PantaniTires = new Tires("Continental Big");
        Brakes PantaniBrakes = new DiscBrake("Shimano");
        Shifter PantaniShifter = new Derailleur("Shimano");
        Bike PantaniBike = new EMTB(PantaniFrame, PantaniTires, PantaniBrakes, PantaniShifter, "Marco Pantani");
        System.out.println(PantaniBike + "\n");

        Frame ZabelFrame = new Alu("white", "Peugeot");
        Tires ZabelTires = new Tires("Continental Regular");
        Brakes ZabelBrakes = new DrumBrake("Shimano");
        Shifter ZabelShifter = new HubGear("Shimano");
        Bike ZabelBike = new ECityBike(ZabelFrame, ZabelTires, ZabelBrakes, ZabelShifter, "Rick Zabel");
        System.out.println(ZabelBike + "\n");
    }
}