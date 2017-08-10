package State;
public class Registered extends OrderState {
    public Registered(Order order) {
        super(order);
    }

    public void AddProduct() {
        order.DoAddProduct();
    }

    public void Grant() {
        order.DoGrant();
        order.SetOrderState(new Granted(order));
    }

    public void Cancel() {
        order.DoCancel();
        order.SetOrderState(new Cancelled(order));
    }
}
