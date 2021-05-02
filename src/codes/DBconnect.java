
package codes;

import com.sun.jdi.connect.spi.Connection;



public class DBconnect {
    public static Connection connect(){
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
           // conn=DriverManager.getConnection(null);
            
        }catch(Exception e){
            
        }
        
        return conn;
    }
    
}
