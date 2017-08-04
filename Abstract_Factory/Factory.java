package Abstract_Factory;

import java.lang.*;

public class Factory {
    public static void main(String[] args) {
        IToyFactory toyFactory = new WoodenToysFactory();
        Bear bear = toyFactory.GetBear();
        Cat cat = toyFactory.GetCat();
        System.out.println("I`ve got " + bear.toString() + " and " + cat.toString());
    }
}

