package VeriTabani;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Baglanti { //super class
    
    
    private final String HOST = "localhost";
    private final String PORT ="3306";
    private final String VeriTabaniAdi="projetakipsistemiv2";
    private final String user="root";
    private final String passWord="";
    
    
    protected Connection connection =null;
    protected Statement statement=null;

    public Baglanti()
    {
        String url = "jdbc:mysql://"+this.HOST+":"+this.PORT+"/"+this.VeriTabaniAdi;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Libray Hatasi");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        try {
            this.connection=DriverManager.getConnection(url, user, passWord);
            System.out.println("Veri Tabanina Baglanti Basarili.");
            
        } catch (SQLException ex) {
            System.out.println("Veri Tabanina Baglanti Basarisiz.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
             
        }
        
    }
    
    
    
}
