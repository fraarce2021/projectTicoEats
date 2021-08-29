package capaDatos;

import capaLogica.PaisOrigen;
import capaLogica.Tarjeta;
import capaLogica.TipoTarjeta;
import capaLogica.TipoUsuario;
import capaLogica.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class UsuarioD {

    ConexionSql conData = new ConexionSql();
    Connection con;

    public UsuarioD() {
        con = conData.ConectorBD();
    }

    public Usuario ConsultaUsuario(String pUsuario, String pClave, int pOpcion) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_USUARIO(?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setString(2, pUsuario);
            statement.setString(3, pClave);
            Boolean resultado = statement.execute();
            Usuario objUser = null;
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    Tarjeta objCreditCard = new Tarjeta(res.getString("NAME").equals("Visa") ? TipoTarjeta.Visa : TipoTarjeta.Mastercard, res.getString("NAME"), res.getString("NAME"), res.getString("NAME"));
                    objUser = new Usuario(res.getString("EMAIL"), res.getString("NAME"), res.getString("PASSWORD"), PaisOrigen.COSTA_RICA, res.getString("PROFILE").equals("Regular") ? TipoUsuario.Regular : res.getString("PROFILE").equals("Gerente") ? TipoUsuario.Gerente : TipoUsuario.Administrador, objCreditCard);
                    objUser.setESTADO(res.getString("ACTIVE"));
                }
            }
            return objUser;
        } catch (SQLException e) {
            System.out.println("Problema en ConsultaUsuario");
            return null;
        }
    }

    public ArrayList<Usuario> ConsultaUsuarios(String pUsuario, String pClave, int pOpcion) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_USUARIO(?,?,?) }");
            statement.setInt(1, pOpcion);
            statement.setString(2, pUsuario);
            statement.setString(3, pClave);
            Boolean resultado = statement.execute();
            ArrayList<Usuario> lstUser = new ArrayList<Usuario>();
            if (resultado) {
                ResultSet res = statement.getResultSet();
                while (res.next()) {
                    Tarjeta objCreditCard = new Tarjeta(res.getString("NAME").equals("Visa") ? TipoTarjeta.Visa : TipoTarjeta.Mastercard, res.getString("NAME"), res.getString("NAME"), res.getString("NAME"));
                    Usuario objUser = new Usuario(res.getString("EMAIL"), res.getString("NAME"), res.getString("PASSWORD"), PaisOrigen.COSTA_RICA, res.getString("PROFILE").equals("Regular") ? TipoUsuario.Regular : res.getString("PROFILE").equals("Gerente") ? TipoUsuario.Gerente : TipoUsuario.Administrador, objCreditCard);

                    lstUser.add(objUser);
                }
            }
            return lstUser;
        } catch (SQLException e) {
            System.out.println("Problema en ConsultaUsuario");
            return null;
        }
    }

    public Boolean ExisteUsuario(String Email) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_CON_USUARIO(?,?) }");
            statement.setInt(1, 1);
            statement.setString(2, Email);
            Boolean resultado = statement.execute();
            if (resultado) {
                ResultSet res = statement.getResultSet();
                if (res.next()) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            return true;
        }
    }

    public void MantenimientoUsuario(Usuario pUsuario, int opcion) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_MAN_USUARIO(?,?,?,?,?,?,?,?,?,?) }");
            statement.setInt(1, opcion);
            statement.setString(2, pUsuario.CORREO_ELECTRONICO);
            statement.setString(3, pUsuario.NOMBRE);
            statement.setString(4, pUsuario.CONTRASENNA);
            statement.setString(5, pUsuario.PAIS_ORIGEN.getNombre());
            statement.setString(6, pUsuario.TIPO_USUARIO.getCodigoTipoUsuario());
            statement.setString(7, pUsuario.TARJETA.getTIPO_TARJETA().name());
            statement.setString(8, pUsuario.TARJETA.getNUMERO_TARJETA());
            statement.setString(9, pUsuario.TARJETA.getCODIGO_TARJETA());
            statement.setString(10, pUsuario.TARJETA.getFECHA_VENCIMIENTO());
            statement.execute();

        } catch (SQLException e) {
            System.out.println("Problema en MantenimientoUsuario");
        }
    }
    public void ActualizarEstadoUsuario(String pCorreo, int opcion) {
        try {
            CallableStatement statement = con.prepareCall("{ call DEV.PA_MAN_ESTADO_USUARIO(?,?) }");
            statement.setInt(1, opcion);
            statement.setString(2, pCorreo);
            statement.execute();

        } catch (SQLException e) {
            System.out.println("Problema en ActualizarEstadoUsuario");
        }
    }
}
