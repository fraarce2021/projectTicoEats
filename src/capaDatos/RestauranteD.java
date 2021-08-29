package capaDatos;

import java.sql.Connection;
import capaLogica.Restaurante;
import capaLogica.TipoComida;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class RestauranteD {

    ConexionSql conData = new ConexionSql();
    Connection con;

    public RestauranteD() {
        con = conData.ConectorBD();
    }

    public Restaurante ExisteRestaurante(String pUsuario, String pNombreRestaurante) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_RESTAURANTE(?,?,?) }");
            statement.setInt(1, 2);
            statement.setString(2, pUsuario);
            statement.setString(3, pNombreRestaurante);
            Boolean resultado = statement.execute();
            Restaurante objRestaurant = null;
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    objRestaurant = new Restaurante(
                            res.getString("NAME"),
                            res.getString("LOCATION"),
                            TipoComida.valueOf(res.getString("TYPE_OF_FOOD")),
                            res.getString("MANAGER"));
                }
            }
            return objRestaurant;
        } catch (SQLException e) {
            System.out.println("Problema en ConsultaUsuario");
            return null;
        }
    }

    public ArrayList<Restaurante> ConsultaRestaurantes(int pOpcion, String pUsuario, String nombreRestaurante) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_RESTAURANTE(?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setString(2, pUsuario);
            statement.setString(3, nombreRestaurante);
            Boolean resultado = statement.execute();

            ArrayList<Restaurante> lstRestaurantes = new ArrayList<Restaurante>();
            Restaurante objRestaurant = null;
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    objRestaurant = new Restaurante(
                            Integer.parseInt(res.getString("PK_RESTAURANT")),
                            res.getString("NAME"),
                            res.getString("LOCATION"),
                            TipoComida.valueOf(res.getString("TYPE_OF_FOOD")),
                            res.getString("MANAGER"));
                    if(pOpcion==3 || pOpcion == 4){
                    objRestaurant.setCALIFICACION(res.getString("RATING"));
                    }
                    lstRestaurantes.add(objRestaurant);
                }
            }
            return lstRestaurantes;
        } catch (SQLException e) {
            System.out.println("Problema en ConsultaUsuario");
            return null;
        }
    }
    public void MantenimientoRestaurante(int pOpcion, Restaurante pRestaurante, String pUsuario) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_MAN_RESTAURANTE(?,?,?,?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setString(2, pUsuario);
            statement.setString(3, pRestaurante.getNOMBRE());
            statement.setString(4, pRestaurante.getLOCALIZACION());
            statement.setString(5, pRestaurante.getTIPO_COMIDA().name());
            statement.setString(6, pRestaurante.getUSUARIO_GERENTE());
            statement.execute();

        } catch (SQLException e) {
            System.out.println("Problema en MantenimientoUsuario");
        }
    }
}
