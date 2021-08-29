package capaDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import capaLogica.Orden;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class OrdenD {

    ConexionSql conData = new ConexionSql();
    Connection con;

    public OrdenD() {
        con = conData.ConectorBD();
    }

    public ArrayList<Orden> ConsultaOrdenes(int pOpcion, String pOrden, String pRestaurante) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_ORDEN(?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setString(2, pOrden);
            statement.setString(3, pRestaurante);
            Boolean resultado = statement.execute();

            ArrayList<Orden> lstOrdenes = new ArrayList<Orden>();
            Orden objOrden = null;
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    objOrden = new Orden(
                            Integer.parseInt(res.getString("PK_ORDER")),
                            res.getString("RESTAURANTE"),
                            res.getString("CLIENT"),
                            Double.parseDouble(res.getString("SUBTOTAL")),
                            Double.parseDouble(res.getString("TAX")),
                            Double.parseDouble(res.getString("TOTAL")),
                            res.getString("CREATED_DATE"),
                            Integer.parseInt(res.getString("RATING")),
                            Integer.parseInt(res.getString("TIME_PREPARATION")));
                    lstOrdenes.add(objOrden);
                }
            }
            return lstOrdenes;
        } catch (SQLException e) {
            System.out.println("Problema en ConsultaOrdenes");
            return null;
        }
    }

    public String MantenimientoOrden(int pOpcion, Orden pOrden) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_MAN_ORDEN(?,?,?,?,?,?,?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setInt(2, pOrden.getPK_ORDEN());
            statement.setString(3, pOrden.getCLIENTE());
            statement.setString(4, pOrden.getRESTAURANTE());
            statement.setDouble(5, pOrden.getSUBTOTAL());
            statement.setDouble(6, pOrden.getIMPUESTO());
            statement.setDouble(7, pOrden.getPRECIO_TOTAL());
            statement.setInt(8, pOrden.getTIEMPO_PREPARACION_TOTAL());
            statement.setInt(9, pOrden.getCALIFICACION());

            Boolean resultado = statement.execute();
            String PK_ORDEN = "";
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    PK_ORDEN = res.getString("PK_ORDEN");
                }
            }
            return PK_ORDEN; 
        } catch (SQLException e) {
            System.out.println("Problema en MantenimientoProducto");
            return "";
        }
    }
      public void CalificarOrden(String pOrden, Integer pCalificacion) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CALIFICAR_ORDEN(?,?) }");
            statement.setString(1, pOrden);
            statement.setInt(2,pCalificacion);
            statement.execute();
            
        } catch (SQLException e) {
            System.out.println("Problema en CalificarOrden");
        }
    }
      public ArrayList<Orden> ConsultaOrdenesUsuario(int pOpcion, String pOrden, String pUsuario) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_ORDEN(?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setString(2, pOrden);
            statement.setString(3, pUsuario);
            Boolean resultado = statement.execute();

            ArrayList<Orden> lstOrdenes = new ArrayList<Orden>();
            Orden objOrden = null;
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    objOrden = new Orden(
                            Integer.parseInt(res.getString("PK_ORDER")),
                            res.getString("RESTAURANTE"),
                            res.getString("CLIENT"),
                            Double.parseDouble(res.getString("SUBTOTAL")),
                            Double.parseDouble(res.getString("TAX")),
                            Double.parseDouble(res.getString("TOTAL")),
                            res.getString("CREATED_DATE"),
                            Integer.parseInt(res.getString("RATING")),
                            Integer.parseInt(res.getString("TIME_PREPARATION")));
                    lstOrdenes.add(objOrden);
                }
            }
            return lstOrdenes;
        } catch (SQLException e) {
            System.out.println("Problema en ConsultaOrdenes");
            return null;
        }
    }
}
