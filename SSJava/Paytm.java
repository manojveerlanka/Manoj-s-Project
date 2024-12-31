public class Paytm extends Payments {

    public static void main(String[] args) {
        Paytm obj = new Paytm();
        obj.CancelOrderId();
        obj.ProcessPayment();
        obj.CreateOrderId();
        obj.Refund();
        obj.VerifyPayment();
        //obj.orderId = 27;
        // int test=obj.CreateOrderId().orderId;

        // to ask. 1.before creating the obj, hw iam ableto access the orderid in
        // processpayment method
        // 2. how to call a local variable of a method from parent class to access in
        // child class
        // about primitive data types

    }

    public void CreateOrderId(){
        orderId=50;
        System.out.println("Paytm:Processing payment for"+orderId);



    }
    public void ProcessPayment() {
         System.out.println("Processing payment for"+orderId);

    }

    public void VerifyPayment() {
        System.out.println("Veifying payment for" + orderId);
    }
}
