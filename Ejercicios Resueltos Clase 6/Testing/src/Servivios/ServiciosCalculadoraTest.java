package Servivios;

import Entidades.Calculadora;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ServiciosCalculadoraTest {

    Calculadora Calc;
    ServiciosCalculadora SCalc;

    @BeforeEach
    public void setUp(){
        Calc = new Calculadora();
        SCalc = new ServiciosCalculadora();
    }

    @org.junit.jupiter.api.Test
    void multiplicarPunto1() {
        Calc = new Calculadora(80D, 3D);
        assertEquals(240D, SCalc.multiplicar(Calc));
    }

    @org.junit.jupiter.api.Test
    void sumarPunto2() {
        Calc = new Calculadora(150D, 180D);
        assertEquals(110D, (SCalc.sumar(Calc)) /3);
    }

    @org.junit.jupiter.api.Test
    void restarPunto3() {
        Calc = new Calculadora(90D, 50D);
        assertEquals(605D, (SCalc.restar(Calc)) * 15 );
    }
    @org.junit.jupiter.api.Test
    void sumarPunto4() {
        Calc = new Calculadora(70D, 40D);
        assertEquals(2700D, (SCalc.sumar(Calc)) * 25);
    }
}