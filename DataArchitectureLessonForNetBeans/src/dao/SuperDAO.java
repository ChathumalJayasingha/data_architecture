/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author Chathumal
 */
public interface SuperDAO<T,Id> {
     public boolean add(T t) throws SQLException, ClassNotFoundException;
            
      public boolean delete(Id id) throws SQLException, ClassNotFoundException ;
      
      
        public boolean update(T t) throws ClassNotFoundException, SQLException;
            
        
        public Customer search(Id id) throws ClassNotFoundException, SQLException;
    
          public ArrayList<T> getAll() throws ClassNotFoundException, SQLException;
          
}
