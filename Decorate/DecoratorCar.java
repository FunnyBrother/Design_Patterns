package Decorate;
public class DecoratorCar extends Car {
    protected Car decoratedCar;

    public DecoratorCar(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    public void Go() {
        decoratedCar.Go();
    }
}

class AmbulanceCar extends DecoratorCar {
    public AmbulanceCar(Car decoratorCar) {
        super(decoratorCar);
    }

    public void Go() {
        decoratedCar.Go();
        System.out.println("... beeep-beep-beeeeep ...");
    }
}
