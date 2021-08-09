package clases;

public class ClassTrucks extends ClassProductos {
    private String modelo;

    public ClassTrucks(String modelo, String marca, double price, int cant) {
        super(marca, price, cant);
        this.modelo = modelo;
    }

    public ClassTrucks(String marca, double price, int cant) {
        super(marca, price, cant);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getCant() {
        return cant;
    }

    @Override
    public void setCant(int cant) {
        this.cant = cant;
    }
}
