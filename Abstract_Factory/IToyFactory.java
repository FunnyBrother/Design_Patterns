package Abstract_Factory;

public interface IToyFactory {
    Bear GetBear();
    Cat GetCat();
}

class TeddyToysFactory implements IToyFactory {
    @Override
    public Bear GetBear() {
        return new TeddyBear();
    }

    @Override
    public Cat GetCat() {
        return new TeddyCat();
    }
}

class WoodenToysFactory implements IToyFactory {
    @Override
    public Bear GetBear() {
        return new WoodenBear();
    }

    @Override
    public Cat GetCat() {
        return new WoodenCat();
    }
}
