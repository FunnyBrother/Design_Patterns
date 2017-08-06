package Composite;
public interface IDocumentComponent {
    public String GatherData();
}

class CustomerDocumentComponent implements IDocumentComponent {
    private static int customerIdToGatherData;

    public CustomerDocumentComponent(int customerIdToGatherData) {
        this.customerIdToGatherData = customerIdToGatherData;
    }

    public String GatherData() {
        String customerData;
        switch (customerIdToGatherData) {
            case 19:
                customerData = "Dima Rusnak";
                break;
            default:
                customerData = "Someone else";
                break;
        }
        return "<Customer>" + customerData + "<Customer";
    }

    public void AddComponent(IDocumentComponent iDocumentComponent) {
        System.out.println("Cannot add to leaf...");
    }
}