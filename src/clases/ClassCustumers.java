package clases;

public class ClassCustumers {
    private String name;
    private double total;
    private String fecha;
    private String hora;

    public ClassCustumers(String name, double total, String fecha, String hora) {
        this.name = name;
        this.total = total;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public ClassCustumers(String name){
        this.name = name;
    }

    public ClassCustumers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
