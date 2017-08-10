package State;
public class OrderState {
    public Order order;

    public OrderState(Order order) {
        this.order = order;
    }

    public void AddProduct() {
        OperationIsNotAllowed("AddProduct");
    }

    public void OperationIsNotAllowed(String operationName) {
        System.out.println("Operation " + operationName + " is now allowed for Order's state "
                + this.getClass().getName());
    }

    public void Cancel() {
        OperationIsNotAllowed("Cancel");
    }

    public void Grant() {
        OperationIsNotAllowed("Grant");
    }

    public void Register() {
        OperationIsNotAllowed("Register");
    }

    public void Ship() {
        OperationIsNotAllowed("Ship");
    }
}
