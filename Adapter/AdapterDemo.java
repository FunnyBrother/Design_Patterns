package Adapter;
public class AdapterDemo {
    public static void Run() {
        NewElectricitySystem newElectricitySystem = new NewElectricitySystem();
        ElectricityConsumer.ChargeNotebook(newElectricitySystem);

        OldElecticitySystem oldElecticitySystem = new OldElecticitySystem();
        Adapter adapter = new Adapter(oldElecticitySystem);
        ElectricityConsumer.ChargeNotebook(adapter);
    }
}
