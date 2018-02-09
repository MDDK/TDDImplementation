

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
    
   
    public static Order getOrder(int referenceNumber){
        
        for(Order order:orders){ //Go through the list that holds all orders
            if(order.referenceNumber==referenceNumber){ //Look for order with matching reference number
                return order; 
            }
        }
        return null;
    }
    
    public static LinkedList<Order> getOrders(){
        return orders;
    }
    
    public static Integer updateOrder(int referenceNumber, int numberOfBricks){
        return referenceNumber;
    }
    
}
