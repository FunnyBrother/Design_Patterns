package Chain_of_Responsibility;

abstract class WeirdCafeVisitor {
    public WeirdCafeVisitor cafeVisitor;

    protected WeirdCafeVisitor(WeirdCafeVisitor cafeVisitor) { this.cafeVisitor = cafeVisitor; }

    public void HandleFood(Food food) {
        if(cafeVisitor != null)
            cafeVisitor.HandleFood(food);
    }
}
