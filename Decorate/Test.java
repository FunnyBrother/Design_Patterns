package Decorate;
public class Test {
    public static void main(String[] args) {
        Car doctorDreams = new AmbulanceCar(new Mercedes());
        doctorDreams.Go();
    }
}
