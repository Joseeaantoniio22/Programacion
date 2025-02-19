package productos;
/**
 * @author Jose Antonio Fernández Guerrero
 */
public class Producto {

    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset



    private long codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    /**
     * @param codigo de nuestro producto
     * @param descripcion que le vamos a poner a nuestro producto
     * @param precioCompra al que compramos el producto
     * @param precioVenta al que vendemos el producto
     * @param stock que vamos a tener de los productos
     */
    public Producto(long codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }


    /**
     * @param codigo le damos el nuevo codigo que queremos
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * @param descripcion le decimos la nueva descripcion que queremos de nuestro producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param precioCompra el nuevo precio de compra del producto
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * @param precioVenta el nuevo precio de venta del producto
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @param stock el nuevo stock que vamos a tener
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return el codigo que tenga el producto
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @return la descripcion del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return el precio de compra del producto
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @return el precio de venta del producto
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @return el stock que tenemos del producto
     */
    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Codigo : "+GREEN_BRIGHT+codigo+RESET+", descripción:"+YELLOW_BRIGHT+descripcion+RESET+
        ", precio de compra del producto: "+YELLOW_BRIGHT+precioCompra+RESET+", precio de venta del producto: "+YELLOW_BRIGHT+
        precioVenta+RESET+", cantidad que hay en stock:"+RED_BRIGHT+stock+RESET+".";
    }

}