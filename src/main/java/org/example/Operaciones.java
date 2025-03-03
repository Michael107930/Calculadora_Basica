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
    public static double restar(List<Double> listaNumeros){
        double resta = 0;
        for (double numero : listaNumeros){
            resta -= numero;
        }
        return resta;
    }
    public static double multiplicar(List<Double> listaNumeros){
        double multiplicacion = 1;
        for (double numero : listaNumeros){
            multiplicacion *= numero;
        }
        return multiplicacion;
    }
    public static double dividir (double num1,double num2){
        if (num2 == 0 ){
            throw new ArithmeticException("No se puede dividir por cero.");
        } else {
            return num1 /num2;
        }
    }
    public static double potenciar (double num1, double num2){
        return Math.pow(num1,num2);
    }
    public static double raices (double num){
        return Math.pow(num,0.5);
    }
    public static double modulo(double num1, double num2){
        if (num2 == 0 ){
            throw new ArithmeticException("No se puede dividir por cero.");
        } else {
            return num1%num2;
        }
    }
    public static double celcius (double num1){
        return ((num1-32)*5/9);
    }
    public static double fahrenheit(double num1){
        return ((num1*9/5)+32);
    }
}
