package capaLogica;

public class Restaurante {
    private int PK_RESTAURANTE;
    private String NOMBRE;
    private String LOCALIZACION;
    private TipoComida TIPO_COMIDA;
    private String USUARIO_GERENTE;
    private String CALIFICACION;

    public Restaurante() {
    }

    public Restaurante(String NOMBRE, String LOCALIZACION, TipoComida TIPO_LOCAL, String USUARIO_GERENTE) {
        this.NOMBRE = NOMBRE;
        this.LOCALIZACION = LOCALIZACION;
        this.TIPO_COMIDA = TIPO_LOCAL;
        this.USUARIO_GERENTE = USUARIO_GERENTE;
    }
    public Restaurante(int PK_RESTAURANTE, String NOMBRE, String LOCALIZACION, TipoComida TIPO_LOCAL, String USUARIO_GERENTE) {
        this.PK_RESTAURANTE = PK_RESTAURANTE;
        this.NOMBRE = NOMBRE;
        this.LOCALIZACION = LOCALIZACION;
        this.TIPO_COMIDA = TIPO_LOCAL;
        this.USUARIO_GERENTE = USUARIO_GERENTE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getLOCALIZACION() {
        return LOCALIZACION;
    }

    public TipoComida getTIPO_COMIDA() {
        return TIPO_COMIDA;
    }

    public String getUSUARIO_GERENTE() {
        return USUARIO_GERENTE;
    }

    public String getPK_RESTAURANTE() {
        return Integer.toString(PK_RESTAURANTE);
    }

    public String getCALIFICACION() {
        return CALIFICACION;
    }

    public void setCALIFICACION(String CALIFICACION) {
        this.CALIFICACION = CALIFICACION;
    }
    
}
