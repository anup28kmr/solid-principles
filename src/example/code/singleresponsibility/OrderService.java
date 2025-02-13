package example.code.singleresponsibility;

public class OrderService {
    // This class is having single responsibility of the orders
    public void placeOrder(Book book) {
        // business logic
    }

    public void cancelOrder(Book book) {
        // business logic
    }
}
