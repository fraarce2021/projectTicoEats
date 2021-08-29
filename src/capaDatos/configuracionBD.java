package capaDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class configuracionBD {
    private String RUTA_ARCHIVO = System.getProperty("user.dir").replace("\\dist", "") + "\\src\\archivo\\config.txt";
    private ObjectOutputStream oEscritor;
    private ObjectInputStream oLector;
    private FileOutputStream archivoEntrada;
    private FileInputStream archivoSalida;
    BufferedReader br = null;

    public configuracionBD() {
    }
    
    public String[] datosConfiguracion() throws FileNotFoundException, IOException{
        String[] Datos = new String[3];
        
        File oArchivo = new File(RUTA_ARCHIVO);
        if (oArchivo.exists()) {
            br = new BufferedReader(new FileReader(oArchivo));
            String texto = br.readLine();
            String[] parts = texto.split(";;");
            Datos = parts;
        }
        
        return Datos; 
    }
}
