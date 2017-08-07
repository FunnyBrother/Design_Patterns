package Chain_of_Responsibility;
public class GirlFriend extends WeirdCafeVisitor {
    public GirlFriend(WeirdCafeVisitor cafeVisitor) { super(cafeVisitor); }
    public void HandleFood(Food food) {
        if(food.getNameOfFood() == "Cappuccino")
            System.out.println("GirlFriend: My lovely cappuccino!");
    }
}
