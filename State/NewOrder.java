package State;
public class NewOrder extends OrderState {
    public NewOrder(Order order) {
        super(order);
    }

    public void AddProduct() {
        order.DoAddProduct();
    }

    public void Register()
    {
        order.DoRegister();
        order.SetOrderState(new Registered(order));
    }

    public void Cancel()
    {
        order.DoCancel();
        order.SetOrderState(new Cancelled(order));
    }

    public void Ship() {
        order.DoShipping();
        order.SetOrderState(new Shipped(order));
    }
}
