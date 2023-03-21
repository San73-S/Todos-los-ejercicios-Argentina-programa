package Servivios;

import Entidades.Calculadora;

public class ServiciosCalculadora {

    public double sumar(Calculadora c){

        return c.getUnNumero() + c.getOtroNumero();
    }

    public double restar(Calculadora c){

        return c.getUnNumero() - c.getOtroNumero();
    }

    public double multiplicar(Calculadora c){

        return c.getUnNumero() * c.getOtroNumero();
    }

    public double dividir(Calculadora c){

        return c.getUnNumero() / c.getOtroNumero();
    }
}
