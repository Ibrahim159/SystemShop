package clases;

public class ClassBearings extends ClassProductos {
    private String modelo;
    private int abec;

    public ClassBearings(String modelo, int abec, String marca, double price, int cant) {
        super(marca, price, cant);
        this.modelo = modelo;
        this.abec = abec;
    }

    public ClassBearings(String marca, double price, int cant) {
        super(marca, price, cant);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAbec() {
        return abec;
    }

    public void setAbec(int abec) {
        this.abec = abec;
    }

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
