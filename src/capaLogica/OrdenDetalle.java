package capaLogica;
/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class OrdenDetalle {
    private int PK_ORDEN_DETALLE;
    private int FK_ORDEN;
    private int LINEA;
    private String PK_PRODUCTO;
    private String PRODUCTO;
    private int CANTIDAD;
    private double SUBTOTAL;
    private double IMPUESTO;
    private double PRECIO_TOTAL;
    private int TIEMPO_PREPARACION;
    private TipoProducto TIPO_PRODUCTO;
    public OrdenDetalle(int PK_ORDEN_DETALLE, int FK_ORDEN, int LINEA, String PK_PRODUCTO, String PRODUCTO, int CANTIDAD, double SUBTOTAL, double IMPUESTO, double PRECIO_TOTAL, int TIEMPO_PREPARACION) {
        this.PK_ORDEN_DETALLE = PK_ORDEN_DETALLE;
        this.FK_ORDEN = FK_ORDEN;
        this.LINEA = LINEA;
        this.PK_PRODUCTO = PK_PRODUCTO;
        this.PRODUCTO = PRODUCTO;
        this.CANTIDAD = CANTIDAD;
        this.SUBTOTAL = SUBTOTAL;
        this.IMPUESTO = IMPUESTO;
        this.PRECIO_TOTAL = PRECIO_TOTAL;
        this.TIEMPO_PREPARACION = TIEMPO_PREPARACION;
    }
    public OrdenDetalle(int FK_ORDEN, int LINEA, String PK_PRODUCTO, int CANTIDAD, double SUBTOTAL, double IMPUESTO, double PRECIO_TOTAL, int TIEMPO_PREPARACION) {
        this.FK_ORDEN = FK_ORDEN;
        this.LINEA = LINEA;
        this.PK_PRODUCTO = PK_PRODUCTO;
        this.CANTIDAD = CANTIDAD;
        this.SUBTOTAL = SUBTOTAL;
        this.IMPUESTO = IMPUESTO;
        this.PRECIO_TOTAL = PRECIO_TOTAL;
        this.TIEMPO_PREPARACION = TIEMPO_PREPARACION;
    }
    public OrdenDetalle(String PK_PRODUCTO, int CANTIDAD, double SUBTOTAL, double IMPUESTO, double PRECIO_TOTAL, int TIEMPO_PREPARACION) {
        this.PK_PRODUCTO = PK_PRODUCTO;
        this.CANTIDAD = CANTIDAD;
        this.SUBTOTAL = SUBTOTAL;
        this.IMPUESTO = IMPUESTO;
        this.PRECIO_TOTAL = PRECIO_TOTAL;
        this.TIEMPO_PREPARACION = TIEMPO_PREPARACION;
    } 

    public String getPK_PRODUCTO() {
        return PK_PRODUCTO;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
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

    public int getFK_ORDEN() {
        return FK_ORDEN;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public int getLINEA() {
        return LINEA;
    }

    public String getPRODUCTO() {
        return PRODUCTO;
    }

    public int getTIEMPO_PREPARACION() {
        return TIEMPO_PREPARACION;
    }

    public void setLINEA(int LINEA) {
        this.LINEA = LINEA;
    }

    public void setFK_ORDEN(int FK_ORDEN) {
        this.FK_ORDEN = FK_ORDEN;
    }

    public TipoProducto getTIPO_PRODUCTO() {
        return TIPO_PRODUCTO;
    }

    public void setTIPO_PRODUCTO(TipoProducto TIPO_PRODUCTO) {
        this.TIPO_PRODUCTO = TIPO_PRODUCTO;
    }
    
}
