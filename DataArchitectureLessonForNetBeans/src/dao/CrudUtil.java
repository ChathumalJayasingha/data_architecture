/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chathumal
 */
public class CrudUtil {
    
    public static PreparedStatement getPreparedStatement(String sql, Object... parameter) throws ClassNotFoundException, SQLException{
        
        Connection connection=DBConnection.DBConnection.getInstance().getConnection();
        PreparedStatement pstm=connection.prepareStatement(sql);
        for(int i=0;  i<parameter.length; i++){
            pstm.setObject((i+1) ,parameter[i]);
        }
        
    
    return pstm;
    }
    
  public static boolean executeUpdate(String sql, Object... params) throws ClassNotFoundException, SQLException {
        PreparedStatement pstm = getPreparedStatement(sql, params);
        return pstm.executeUpdate() > 0;
    }

    public static ResultSet executeQuery(String sql, Object... params) throws ClassNotFoundException, SQLException {
        PreparedStatement pstm = getPreparedStatement(sql, params);
        return pstm.executeQuery();
    }
}
