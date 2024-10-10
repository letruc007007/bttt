/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateBaseUtil;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class DatebaseUtil {
    public static Connection getConnection(){
        Connection conn=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection("jdbc:sqlserver://pc302;databaseName=demodb", "sa", "sa");
        }catch (Exception e){
            System.out.println("Loi:"+e.toString());
        }
        return conn;
    }
}
