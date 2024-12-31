public class Payments {
    int orderId ;

    public void CreateOrderId() {
        orderId = 22;
        System.out.println("payments:orderId created");

    }

    public void Refund() {
        System.out.println("Refund Initiated" + orderId);
    }

    public void CancelOrderId() {

        System.out.println("Order Cancelled" + orderId);
    }

}
