package Adapter;

public class Adapter implements INewElectricitySystem {
    private OldElecticitySystem adaptee;

    public Adapter(OldElecticitySystem adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String MatchWideSocket() {
        return adaptee.MatchThinSocket();
    }
}

class ElectricityConsumer {
    public static void ChargeNotebook(INewElectricitySystem electricitySystem) {
        System.out.println(electricitySystem.MatchWideSocket());
    }
}