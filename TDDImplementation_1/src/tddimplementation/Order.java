/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddimplementation;

/**
 *
 * @author Novus_Admin
 */
public class Order {
    static int totalOrders;
    Integer numberOfBricks;
    Integer referenceNumber;
    
    public Order(int numberOfBricks){
        this.totalOrders++;
        this.referenceNumber=totalOrders;
        this.numberOfBricks = numberOfBricks;
        
       
    }
}
