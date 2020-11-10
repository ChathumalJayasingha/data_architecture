
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dao.SuperDAO;
import model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DBConnection.DBConnection;
import dao.customImpl.CustomerDAOImpl;
import javax.swing.JOptionPane;

/**
 *
 * @author Chathumal
 */
public class CustomerController {
       static SuperDAO customerDAO=new CustomerDAOImpl();
        
    public static boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException{
     return  customerDAO.add(customer);
        
    }
    public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException{
     return customerDAO.update(customer);
        
    }
    public static Customer searchCustomer(String id) throws ClassNotFoundException, SQLException{
     return customerDAO.search(id);
     
    }
    public static boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException{
     return  customerDAO.delete(id);
    }
    public static ArrayList<Customer>getAllCustomers() throws ClassNotFoundException, SQLException{
     return  customerDAO.getAll();
    }
}
