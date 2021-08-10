package clases;

public class ClassContador {
    int cont = 0;

    public ClassContador(int cont) {
        this.cont = cont;
    }

    public ClassContador() {
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont += cont;
    }
    
    public void resetCounter(){
        this.cont = 0;
    }
}
