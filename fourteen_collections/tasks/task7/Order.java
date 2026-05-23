package fourteen_collections.tasks.task7;

public class Order implements Comparable<Order> {
    String client;
    int totalPrice;
    int productsCount;

    @Override
    public int compareTo(Order other) {
        if (this.totalPrice != other.totalPrice) {
            return other.totalPrice - this.totalPrice;
        }

        if (this.productsCount != other.productsCount) {
            return this.productsCount - other.productsCount;
        }
        return 0;
    }
}
