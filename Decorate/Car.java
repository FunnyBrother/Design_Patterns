package Decorate;
abstract class Car {
    protected String BrandName;
    public void Go() {
        System.out.println("I`m " + BrandName + " and I`m on my way...");
    }
}

class Mercedes extends Car {
    public Mercedes() {
        BrandName = "Mercedes";
    }
}
