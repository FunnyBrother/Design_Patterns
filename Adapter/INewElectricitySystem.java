package Adapter;

public interface INewElectricitySystem {
    String MatchWideSocket();
}

class NewElectricitySystem implements INewElectricitySystem {
    @Override
    public String MatchWideSocket() {
        return "220V";
    }
}
