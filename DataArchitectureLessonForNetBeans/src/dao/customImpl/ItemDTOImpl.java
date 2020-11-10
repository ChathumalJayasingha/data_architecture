/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customImpl;

import dao.CrudUtil;
import dao.custom.ItemDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;
import model.Item;

/**
 *
 * @author Chathumal
 */
public class ItemDTOImpl implements ItemDAO{
    
    public static boolean addItem(Item item) throws ClassNotFoundException, SQLException{
        String sql="insert into item values(?,?,?,?)";
        return CrudUtil.executeUpdate(sql, item.getItemcode(),item.getDescription(),item.getUnitprice(),item.getUnitprice());
    }
     public static boolean deleteItem(String code) throws SQLException, ClassNotFoundException{
      String sql = "delete from Customer where id=?";
        return CrudUtil.executeUpdate(sql, code);
    }
     public static boolean updateItem(Item item){
        return false;
     
     
     }

    @Override
    public boolean add(Object t) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer search(Object id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
