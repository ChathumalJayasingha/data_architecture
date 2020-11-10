/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Item;

import DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Chathumal
 */
public class ItemContraller {

   public static boolean addItem(Item item) throws ClassNotFoundException, SQLException{
       return dao.CrudUtil.executeUpdate(item.getItemcode(),item.getDescription(),item.getUnitprice(),item.getUnitprice() );
               
       
    } public  static Item searchItem(String ItemCode) throws ClassNotFoundException, SQLException {
        return (Item) dao.CrudUtil.executeQuery(ItemCode);
        
    }
    
 /*   public static  boolean  updateStock(ArrayList<OrderDetail> orderDetailList) throws ClassNotFoundException, SQLException{
            
        for(OrderDetail orderDetail:orderDetailList){
                    boolean isUpdateStock=updateStock(orderDetail);
                    if(isUpdateStock){
                        return false;
                    }
        
        }
    return true;
    }
    public static boolean updateStock(OrderDetail orderDetail) throws ClassNotFoundException, SQLException{
                PreparedStatement stm=(PreparedStatement) DBConnection.getInstance().getConnection().prepareStatement("update item set qtyonhand = qtyonhand -? where itemcode=?;");
                stm.setObject(1, orderDetail.getOrderqty());
                stm.setObject(2, orderDetail.getItemCode());
                
                        return stm.executeUpdate()>0;
                
    
    }
    */
    
    
}
