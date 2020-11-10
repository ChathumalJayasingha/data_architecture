/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customImpl;

import dao.CrudUtil;
import dao.custom.CustomerDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Customer;

/**
 *
 * @author Chathumal
 */
public class CustomerDAOImpl implements CustomerDAO{
      public boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException{
    String sql = "insert into Customer values(?,?,?,?)";
        return CrudUtil.executeUpdate(sql, customer.getId(), customer.getName(), customer.getAddress(), customer.getSalary());
   
   }
      public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException{
      String sql = "delete from Customer where id=?";
        return CrudUtil.executeUpdate(sql, id);
   
   }
       public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException{
    String sql = "update Customer set name=?,address=?,salary=? where id=?";
        return CrudUtil.executeUpdate(sql, customer.getName(), customer.getAddress(), customer.getSalary(), customer.getId());      
        
    }   public Customer searchCustomer(String id) throws ClassNotFoundException, SQLException{
     String sql = "select * from Customer where id=?";
        ResultSet rst = CrudUtil.executeQuery(sql, id);
        if (rst.next()) {
            return new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4));
        }
        return null;
    
    }
    
       public ArrayList<Customer> getAllCustomers() throws ClassNotFoundException, SQLException{
         String sql = "select * from Customer";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Customer> allCustomers = new ArrayList<>();
        while (rst.next()) {
            allCustomers.add(new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4)));
        }
        return allCustomers;
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

