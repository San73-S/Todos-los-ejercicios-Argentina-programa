package Main;

import Entidades.Calculadora;
import Servivios.ServiciosCalculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora Calc = new Calculadora(15.122,5.874);
        ServiciosCalculadora SCalc = new ServiciosCalculadora();

        SCalc.sumar(Calc);
        SCalc.restar(Calc);
        SCalc.multiplicar(Calc);
        SCalc.dividir(Calc);

    }
}