package capaLogica;

public class Usuario {
    public String CORREO_ELECTRONICO;
    public String NOMBRE;
    public String CONTRASENNA;
    public PaisOrigen PAIS_ORIGEN;
    public TipoUsuario TIPO_USUARIO;
    public Tarjeta TARJETA;
    public String ESTADO;

    public Usuario() {
    }
    
    public Usuario(String CORREO_ELECTRONICO, String NOMBRE, String CONTRASENNA, PaisOrigen PAIS_ORIGEN, TipoUsuario TIPO_USUARIO, Tarjeta TARJETA) {
        this.CORREO_ELECTRONICO = CORREO_ELECTRONICO;
        this.NOMBRE = NOMBRE;
        this.CONTRASENNA = CONTRASENNA;
        this.PAIS_ORIGEN = PAIS_ORIGEN;
        this.TIPO_USUARIO = TIPO_USUARIO;
        this.TARJETA = TARJETA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public String getCONTRASENNA() {
        return CONTRASENNA;
    }

    public TipoUsuario getTIPO_USUARIO() {
        return TIPO_USUARIO;
    }

    public String getCORREO_ELECTRONICO() {
        return CORREO_ELECTRONICO;
    }
    
}
