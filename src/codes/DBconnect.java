
package codes;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;



public class DBconnect {
    public static Connection connect(){
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstjavaproject","root","");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        return conn;
    }
    
}
