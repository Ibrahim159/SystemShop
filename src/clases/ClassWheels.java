package clases;

public class ClassWheels extends ClassProductos {
    private String modelo;
    private String medida;

    public ClassWheels(String modelo, String medida, String marca, double price, int cant) {
        super(marca, price, cant);
        this.modelo = modelo;
        this.medida = medida;
    }

    public ClassWheels(String marca, double price, int cant) {
        super(marca, price, cant);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
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
