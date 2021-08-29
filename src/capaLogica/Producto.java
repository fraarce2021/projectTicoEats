package capaLogica;

public class Producto  {
    private String CODIGO;
    private String DESCRIPCION;
    private double PRECIO;
    private String RESTAURANTE;
    private TipoProducto TIPO_PRODUCTO;
    private int CANTIDAD_DISPONIBLE;
    private int IMPUESTO;
    private int TIEMPO_MINIMO_PREPARADO;

    public Producto() {
    }
    
    public Producto(String CODIGO, String DESCRIPCION, double PRECIO, String RESTAURANTE, TipoProducto TIPO_PRODUCTO, int CANTIDAD_DISPONIBLE, int IMPUESTO, int TIEMPO_MINIMO_PREPARADO) {
        this.CODIGO = CODIGO;
        this.DESCRIPCION = DESCRIPCION;
        this.PRECIO = PRECIO;
        this.RESTAURANTE = RESTAURANTE;
        this.TIPO_PRODUCTO = TIPO_PRODUCTO;
        this.CANTIDAD_DISPONIBLE = CANTIDAD_DISPONIBLE;
        this.IMPUESTO = IMPUESTO;
        this.TIEMPO_MINIMO_PREPARADO = TIEMPO_MINIMO_PREPARADO;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public double getPRECIO() {
        return PRECIO;
    }

    public String getRESTAURANTE() {
        return RESTAURANTE;
    }

    public TipoProducto getTIPO_PRODUCTO() {
        return TIPO_PRODUCTO;
    }

    public int getCANTIDAD_DISPONIBLE() {
        return CANTIDAD_DISPONIBLE;
    }

    public int getIMPUESTO() {
        return IMPUESTO;
    }

    public int getTIEMPO_MINIMO_PREPARADO() {
        return TIEMPO_MINIMO_PREPARADO;
    }
}
