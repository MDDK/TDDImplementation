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
public class TDDImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TDDImplementation test = new TDDImplementation();
        
        test.createOrder_returnsUniqueOrderReference();
        System.out.println("createOrder_returnsUniqueOrderReference PASSED");        
    }
    public void createOrder_returnsUniqueOrderReference(){
        // Setup
        
        // Act        
        Integer ref = OrderManager.createOrder(1);
        // Assert
        assert ref!=null; //Assert that order reference is returned
        int equalRefCounter=0;
        for(Order orderTemp:OrderManager.orders){
            if(ref==orderTemp.referenceNumber){
                equalRefCounter+=1;
            }            
        }
        assert equalRefCounter==1; //Assert that there is 1 order with that reference number (unique)
    }
    
   
    
    
    
}
