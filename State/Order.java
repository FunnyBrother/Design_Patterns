package State;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private OrderState state;
    private List<Product> productList = new ArrayList<>();

    public Order() {
        state = new NewOrder(this);
    }

    public void SetOrderState(OrderState state) {
        this.state = state;
    }

    public void WriteCurrentStateName() {
        System.out.println("Current Order's state: " + state.getClass().getName());
    }

    public void AddProduct(Product product) {
        productList.add(product);
        state.AddProduct();
    }


    public void Grant() {
        state.Grant();
    }

    public void Cancel() {
        state.Cancel();
    }

    public void Ship() {
        state.Ship();
    }

    public void Register() {
        state.Register();
    }

    public void DoShipping() {
        System.out.println("Shipping...");
    }

    public void DoAddProduct() {
        System.out.println("Adding product...");
    }

    public void DoCancel() {
        System.out.println("Cancellation...");
    }

    public void DoRegister() {
        System.out.println("Registering...");
    }

    public void DoGrant() {
        System.out.println("Granting...");
    }
}
