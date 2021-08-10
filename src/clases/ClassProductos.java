package clases;

public abstract class ClassProductos {
    protected String marca;
    protected double price;
    protected int cant;

    public ClassProductos(String marca, double price, int cant) {
        this.marca = marca;
        this.cant = cant;
        if(cant > 0){
            this.price = price * cant;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(this.cant != 0){
            this.price *= cant;
        }
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
}
