/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Refactored;
import java.util.List;
/**
 *
 * @author DANNA
 */
public interface OrderRepository {
     
        void save(Order order);
        List<Order> findAll();
        Order findById(String id);

}
