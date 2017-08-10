package State;
public class MainAppState {
    public static void main(String[] args) {
        Product beer = new Product();
        beer.name = "MyBestBear";
        beer.price = 78000;

        Order order = new Order();
        order.WriteCurrentStateName();

        order.AddProduct(beer);
        order.WriteCurrentStateName();

        order.Register();
        order.WriteCurrentStateName();

        order.Grant();
        order.WriteCurrentStateName();

        order.Ship();
        order.WriteCurrentStateName();
    }
}
