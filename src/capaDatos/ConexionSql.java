package capaDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConexionSql {
    
    public Connection con;

    
    public Connection ConectorBD(){
        try {
            String[] datos = new configuracionBD().datosConfiguracion();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String connectionURL = "jdbc:sqlserver://"+datos[0]+";databaseName="+datos[1]+";user="+datos[2]+";password="+datos[3]+";";
                con = DriverManager.getConnection(connectionURL);
                return con;
        } 
        catch (SQLException se) {
            System.out.println("Problema de conexion");
        } 
        catch (ClassNotFoundException cnfe) {
            
        }
        finally{
        return con;
        }      
    }
    
    
    
     
    
}
