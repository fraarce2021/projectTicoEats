package capaDatos;

import capaLogica.OrdenDetalle;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class OrdenDetalleD {
    ConexionSql conData = new ConexionSql();
    Connection con;

    public OrdenDetalleD() {
        con = conData.ConectorBD();
    }

    public ArrayList<OrdenDetalle> ConsultaOrdenDetalle(int pOpcion, String pOrden, String pRestaurante) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_ORDEN(?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setString(2, pOrden);
            statement.setString(3, pRestaurante);
            Boolean resultado = statement.execute();

            ArrayList<OrdenDetalle> lstOrdenes = new ArrayList<OrdenDetalle>();
            OrdenDetalle objOrdenDetalle = null;
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    objOrdenDetalle = new OrdenDetalle(
                            Integer.parseInt(res.getString("PK_ORDER")),
                            res.getInt("LINE"),
                            res.getString("CLIENT"),
                            Integer.parseInt(res.getString("SUBTOTAL")),
                            Double.parseDouble(res.getString("TAX")),
                            Double.parseDouble(res.getString("TOTAL")),
                            Double.parseDouble(res.getString("CREATED_DATE")),
                            Integer.parseInt(res.getString("RATING")));
                    lstOrdenes.add(objOrdenDetalle);
                }
            }
            return lstOrdenes;
        } catch (SQLException e) {
            System.out.println("Problema en ConsultaOrdenes");
            return null;
        }
    }

    public void MantenimientoOrdenDetalle(int pOpcion, OrdenDetalle pOrden) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_MAN_ORDEN_LINEA(?,?,?,?,?,?,?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setInt(2, pOrden.getFK_ORDEN());
            statement.setInt(3, pOrden.getLINEA());
            statement.setString(4, pOrden.getPK_PRODUCTO());
            statement.setInt(5, pOrden.getCANTIDAD());
            statement.setInt(6, pOrden.getTIEMPO_PREPARACION());
            statement.setDouble(7, pOrden.getSUBTOTAL());
            statement.setDouble(8, pOrden.getIMPUESTO());
            statement.setDouble(9, pOrden.getPRECIO_TOTAL());

            statement.execute();
           
        } catch (SQLException e) {
            System.out.println("Problema en MantenimientoProducto");
        }
    }
    public void ReducirCantidadOrdenDetalle(String pRestaurante,String pProducto, Integer pCantidad) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_ACTUALIZAR_CANTIDAD_PRODUCTO(?,?,?) }");
            statement.setString(1, pRestaurante);
            statement.setString(2, pProducto);
            statement.setInt(3, pCantidad);

            statement.execute();
           
        } catch (SQLException e) {
            System.out.println("Problema en MantenimientoProducto");
        }
    }
}
