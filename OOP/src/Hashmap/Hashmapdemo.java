
package Hashmap;

import java.util.HashMap;

public class Hashmapdemo {
    public static void main(String[] args) {
        HashMap<Integer,String> customer=new HashMap<Integer,String>();
        
        customer.put(101,"Nishi");
        customer.put(102,"Tusher");
        customer.put(103,"Samira");
        customer.put(104,"Pritthi");
        
        System.out.println(customer.get(101));
    }

    
    
}
