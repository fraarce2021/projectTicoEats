/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoticoeats;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Vellaquito
 */
public class ProyectoTicoEats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//                String connectionURL = "jdbc:sqlserver://DESKTOP-48A1MQC:1433;databaseName=DB_DELIVERY_FOOD;user=sa;password=Sql2021;";
//                Connection con = DriverManager.getConnection(connectionURL);
//                System.out.println("ak7");
                
         frmInicio ventana = new frmInicio();
         ventana.setVisible(true);
         ventana.setLocationRelativeTo(null);
    }
    
}
