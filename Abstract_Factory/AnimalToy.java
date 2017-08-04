package Abstract_Factory;

public abstract class AnimalToy {
    AnimalToy() {}
}

abstract class Cat extends AnimalToy {
    Cat() { }
}

abstract class Bear extends AnimalToy {
    Bear() {}
}


class WoodenCat extends Cat {
    private String name;
    public WoodenCat() {
        this.name = "Wooden Cat";
    }
}

class TeddyCat extends Cat {
    private String name;
    public TeddyCat() {
        this.name = "Teddy Cat";
    }
}

class WoodenBear extends Bear {
    private String name;
    public WoodenBear() {
        this.name = "Wooden Bear";
    }
}

class TeddyBear extends Bear {
    private String name;
    public TeddyBear() {
        this.name = "TeddyBear";
    }
}