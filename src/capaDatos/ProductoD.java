package capaDatos;

import java.sql.Connection;
import capaLogica.Producto;
import capaLogica.TipoProducto;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class ProductoD {
    ConexionSql conData = new ConexionSql();
    Connection con;

    public ProductoD() {
        con = conData.ConectorBD();
    }
    public Producto ExisteProducto(String pProducto) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_PRODUCTO(?,?) }");
            statement.setInt(1, 1);
            statement.setString(2, pProducto);
            Boolean resultado = statement.execute();
            Producto objRestaurant = null;
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    objRestaurant = new Producto(
                            res.getString("PK_PRODUCT"),
                            res.getString("DESCRIPTION"),
                            Double.parseDouble(res.getString("PRICE")),
                            res.getString("RESTAURANT"),
                            TipoProducto.valueOf(res.getString("TYPE_OF_PRODUCT")),
                            Integer.parseInt(res.getString("STOCKS")),
                            Integer.parseInt(res.getString("TAX")),
                            Integer.parseInt(res.getString("PREPARATION_TIME")));
                }
            }
            return objRestaurant;
        } catch (SQLException e) {
            System.out.println("Problema en ExisteProducto");
            return null;
        }
    }
        public Producto ObtenerProductorRestaurante(String pRestaurante, String pProducto) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_PRODUCTO(?,?,?) }");
            statement.setInt(1, 3);
            statement.setString(2, pProducto);
            statement.setString(3, pRestaurante);
            Boolean resultado = statement.execute();
            Producto objRestaurant = null;
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    objRestaurant = new Producto(
                            res.getString("PK_PRODUCT"),
                            res.getString("DESCRIPTION"),
                            Double.parseDouble(res.getString("PRICE")),
                            res.getString("RESTAURANT"),
                            TipoProducto.valueOf(res.getString("TYPE_OF_PRODUCT")),
                            Integer.parseInt(res.getString("STOCKS")),
                            Integer.parseInt(res.getString("TAX")),
                            Integer.parseInt(res.getString("PREPARATION_TIME")));
                }
            }
            return objRestaurant;
        } catch (SQLException e) {
            System.out.println("Problema en ExisteProducto");
            return null;
        }
    }
    public ArrayList<Producto> ConsultaProductos(int pOpcion, String pProducto, String pRestaurante) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_PRODUCTO(?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setString(2, pProducto);
            statement.setString(3, pRestaurante);
            Boolean resultado = statement.execute();

            ArrayList<Producto> lstRestaurantes = new ArrayList<Producto>();
            Producto objRestaurant = null;
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    objRestaurant = new Producto(
                            res.getString("PK_PRODUCT"),
                            res.getString("DESCRIPTION"),
                            Double.parseDouble(res.getString("PRICE")),
                            res.getString("RESTAURANT"),
                            TipoProducto.valueOf(res.getString("TYPE_OF_PRODUCT")),
                            Integer.parseInt(res.getString("STOCKS")),
                            Integer.parseInt(res.getString("TAX")),
                            Integer.parseInt(res.getString("PREPARATION_TIME")));
                   lstRestaurantes.add(objRestaurant);
                }
            }
            return lstRestaurantes;
        } catch (SQLException e) {
            System.out.println("Problema en ConsultaProductos");
            return null;
        }
    }
    public void MantenimientoProducto(int pOpcion, Producto pRestaurante, String pUsuario) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_MAN_PRODUCTO(?,?,?,?,?,?,?,?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setString(2, pUsuario);
            statement.setString(3, pRestaurante.getCODIGO());
            statement.setString(4, pRestaurante.getDESCRIPCION());
            statement.setDouble(5, pRestaurante.getPRECIO());
            statement.setString(6, pRestaurante.getRESTAURANTE());
            statement.setString(7, pRestaurante.getTIPO_PRODUCTO().name());
            statement.setInt(8, pRestaurante.getCANTIDAD_DISPONIBLE());
            statement.setInt(9, pRestaurante.getIMPUESTO());
            statement.setInt(10, pRestaurante.getTIEMPO_MINIMO_PREPARADO());
            
            
            statement.execute();

        } catch (SQLException e) {
            System.out.println("Problema en MantenimientoProducto");
        }
    }
}
