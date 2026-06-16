package model;

public class Tour {
    
    //Atributos
    private String nombre;
    private String tipo;
    private int precio;
    private int stock;

    
    /**
     * Constructor de la clase Tour
     * @param nombre            Nombre del tour.
     * @param tipo              Tipo de tour.
     * @param precio            Precio en pesos chilenos del tour.
     * @param stock             Stock disponible del tour.
     */
    public Tour(String nombre, String tipo, int precio, int stock) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
   
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nTipo: " + tipo +
               "\nPrecio: $" + precio +
               "\nStock: " + stock;
                
    }
}