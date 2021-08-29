package capaLogica;

import java.sql.Date;

public class Tarjeta {
    private TipoTarjeta TIPO_TARJETA;
    private String NUMERO_TARJETA;
    private String CODIGO_TARJETA;
    private String FECHA_VENCIMIENTO;

    public Tarjeta(TipoTarjeta TIPO_TARJETA, String NUMERO_TARJETA, String CODIGO_TARJETA, String FECHA_VENCIMIENTO) {
        this.TIPO_TARJETA = TIPO_TARJETA;
        this.NUMERO_TARJETA = NUMERO_TARJETA;
        this.CODIGO_TARJETA = CODIGO_TARJETA;
        this.FECHA_VENCIMIENTO = FECHA_VENCIMIENTO;
    }
    public TipoTarjeta getTIPO_TARJETA() {
        return TIPO_TARJETA;
    }
    public String getNUMERO_TARJETA() {
        return NUMERO_TARJETA;
    }
    public String getCODIGO_TARJETA() {
        return CODIGO_TARJETA;
    }
    public String getFECHA_VENCIMIENTO() {
        return FECHA_VENCIMIENTO;
    }
}
