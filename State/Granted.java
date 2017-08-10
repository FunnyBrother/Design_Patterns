package State;
public class Granted extends OrderState {
    public Granted(Order order) {
        super(order);
    }

    public void AddProduct() {
        order.DoAddProduct();
    }

    public void Ship() {
        order.DoShipping();
        order.SetOrderState(new Shipped(order));
    }

    public void Cancel() {
        order.DoCancel();
        order.SetOrderState(new Cancelled(order));
    }

    public void Register() {
        order.DoRegister();
        order.SetOrderState(new Registered(order));
    }
}
