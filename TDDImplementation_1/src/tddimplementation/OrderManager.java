

package tddimplementation;
import java.util.LinkedList;
/**
 *
 * @author Novus_Admin
 */


public class OrderManager {
    
    
    static LinkedList<Order> orders = new LinkedList<Order>();
    public static Integer createOrder(int numberOfBricks){
        Order order = new Order(numberOfBricks);
        orders.add(order);
        return order.referenceNumber;
    }
    
    
}
