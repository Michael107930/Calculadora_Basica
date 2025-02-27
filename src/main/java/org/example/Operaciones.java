package org.example;

import java.util.List;

public class Operaciones {
    public static double sumar(List<Double> listaNumeros) {
        double suma = 0;
        for (double numero : listaNumeros) {
            suma += numero;
        }
        return suma;
    }
}
