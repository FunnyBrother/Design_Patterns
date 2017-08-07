package Chain_of_Responsibility;
import java.util.*;
class BestFriend extends WeirdCafeVisitor {
    public List<Food> coffeeContainingFood;

    public BestFriend(WeirdCafeVisitor cafeVisitor) {
        super(cafeVisitor);
        coffeeContainingFood = new ArrayList<>();
    }

    @Override
    public void HandleFood(Food food) {
        if(food.containsIs("Meet"))
            System.out.println("BestFriend: I just ate + " + food.getNameOfFood() + "It was tasty");
        if(food.containsIs("Coffee")) {
            coffeeContainingFood.add(food);
            System.out.println("BestFriend: I have to take something with coffee. " + food.getNameOfFood() + "" +
                    "looks fine");
        }
        super.HandleFood(food);
    }
}
