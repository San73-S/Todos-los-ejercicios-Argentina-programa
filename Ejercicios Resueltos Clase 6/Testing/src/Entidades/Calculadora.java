package Entidades;

public class Calculadora {

    private double unNumero;
    private double otroNumero;

    public Calculadora() {
    }

    public Calculadora(double unNumero, double otroNumero) {
        this.unNumero = unNumero;
        this.otroNumero = otroNumero;
    }

    public double getUnNumero() {
        return unNumero;
    }

    public void setUnNumero(double unNumero) {
        this.unNumero = unNumero;
    }

    public double getOtroNumero() {
        return otroNumero;
    }

    public void setOtroNumero(double otroNumero) {
        this.otroNumero = otroNumero;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "unNumero=" + unNumero +
                ", otroNumero=" + otroNumero +
                '}';
    }
}
