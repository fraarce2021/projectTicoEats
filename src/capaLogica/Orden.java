package capaLogica;

import java.sql.Date;
/**
 *
 * @author Francisco Arce Chavarria
 */
public class Orden {
    private int PK_ORDEN;
    private String RESTAURANTE;
    private String CLIENTE;
    private double SUBTOTAL;
    private double IMPUESTO;
    private double PRECIO_TOTAL;
    private String FECHA_CREACION;
    private int CALIFICACION;
    private int TIEMPO_PREPARACION_TOTAL;

    public Orden(int PK_ORDEN, String RESTAURANTE ,String CLIENTE, double SUBTOTAL, double IMPUESTO, double PRECIO_TOTAL, String FECHA_CREACION, int CALIFICACION, int TIEMPO_PREPARACION_TOTAL) {
        this.PK_ORDEN = PK_ORDEN;
        this.RESTAURANTE = RESTAURANTE;
        this.CLIENTE = CLIENTE;
        this.SUBTOTAL = SUBTOTAL;
        this.IMPUESTO = IMPUESTO;
        this.PRECIO_TOTAL = PRECIO_TOTAL;
        this.FECHA_CREACION = FECHA_CREACION;
        this.CALIFICACION = CALIFICACION;
        this.TIEMPO_PREPARACION_TOTAL = TIEMPO_PREPARACION_TOTAL;
    }
    public Orden(String RESTAURANTE ,String CLIENTE, double SUBTOTAL, double IMPUESTO, double PRECIO_TOTAL, int CALIFICACION, int TIEMPO_PREPARACION_TOTAL) {
        this.RESTAURANTE = RESTAURANTE;
        this.CLIENTE = CLIENTE;
        this.SUBTOTAL = SUBTOTAL;
        this.IMPUESTO = IMPUESTO;
        this.PRECIO_TOTAL = PRECIO_TOTAL;
        this.CALIFICACION = CALIFICACION;
        this.TIEMPO_PREPARACION_TOTAL = TIEMPO_PREPARACION_TOTAL;
    }
    public int getPK_ORDEN() {
        return PK_ORDEN;
    }

    public String getCLIENTE() {
        return CLIENTE;
    }

    public String getRESTAURANTE() {
        return RESTAURANTE;
    }

    public double getSUBTOTAL() {
        return SUBTOTAL;
    }

    public double getIMPUESTO() {
        return IMPUESTO;
    }

    public double getPRECIO_TOTAL() {
        return PRECIO_TOTAL;
    }

    public int getTIEMPO_PREPARACION_TOTAL() {
        return TIEMPO_PREPARACION_TOTAL;
    }

    public int getCALIFICACION() {
        return CALIFICACION;
    }

    public String getFECHA_CREACION() {
        return FECHA_CREACION;
    }
    
    
}
