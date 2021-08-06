package clases;

import gui.main;
import java.util.Calendar;

public class Reloj {
    private int year;
    private int month;
    private int day;

    public Reloj(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Reloj() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDia() {
        return day;
    }

    public void setDia(int day) {
        this.day = day;
    }
    
    public String hfActual(){
        Calendar calendario = Calendar.getInstance();
        this.year = calendario.get(calendario.YEAR);
        this.month = calendario.get(calendario.MONTH) + 1;
        this.day = calendario.get(calendario.DATE);
        
        return this.day + "/" + this.month + "/" + this.year;
    }
}
