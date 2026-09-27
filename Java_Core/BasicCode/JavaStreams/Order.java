package Java_Core.BasicCode.JavaStreams;

public class Order {
    private  String orderId;
    private String customerCategory; //(e.g., "REGULAR", "VIP", "PREMIUM")
    private double totalAmount;
    private boolean isFulfilled;

    public Order(String orderId, String customerCategory, double totalAmount, boolean isFulfilled){
        this.orderId = orderId;
        this.customerCategory = customerCategory;
        this.totalAmount = totalAmount;
        this.isFulfilled = isFulfilled;

    }

    public boolean isFulfilled(){
        return this.isFulfilled;
    }
    public double getTotalAmount(){
        return this.totalAmount;
    }
    public String getCustomerCategory(){
        return this.customerCategory;
    }
    public String getOrderId(){
        return this.orderId;
    }
}
