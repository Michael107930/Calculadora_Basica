package org.example;
import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {



        System.out.println("BIENVENIDO A TU CALCULADORA");
        System.out.println("Digita tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        java.lang.String name = scanner.nextLine();
        int salir = 1;
        while (salir >= 1) {
            Menu.mostrarMenu();
            System.out.println("Ok " + name + " selecciona la opcion que deseas hacer: ");
            int elec = scanner.nextInt();
            switch (elec) {
                case 1:
                    List<Double> listaNumeros = new ArrayList<>();
                    System.out.println("¿Cuantos numeros deseas sumar?");
                    int cantN = scanner.nextInt();
                    int i = 1;
                    while (cantN + 1 != i) {
                        System.out.println("Digite el numero " + i + ": ");
                        listaNumeros.add(scanner.nextDouble());
                        i = i + 1;
                    }
                    double sumaTotal = Operaciones.sumar(listaNumeros);
                    System.out.println("La suma de los numeros ingresados es de: " + sumaTotal);
                    break;
                case 2:
                    List<Double> listaNumeros1 = new ArrayList<>();
                    System.out.println("¿Cuantos números deseas restar?");
                    int cantN1 = scanner.nextInt();
                    int a = 1;
                    while (cantN1 + 1 != a) {
                        System.out.println("Digite el numero " + a + ":");

                        listaNumeros1.add(scanner.nextDouble());
                        a += 1;
                    }
                    double resta_total = Operaciones.restar(listaNumeros1);
                    System.out.println("La resta de los números ingresados es de: " + resta_total);
                    break;
                case 3:
                    List<Double> listaNumeros2 = new ArrayList<>();
                    System.out.println("¿Cuantos números deseas multiplicar?");
                    int cantN2 = scanner.nextInt();
                    int b = 1;
                    while (cantN2 + 1 != b) {
                        System.out.println("Digite el numero " + b + ":");

                        listaNumeros2.add(scanner.nextDouble());
                        b += 1;
                    }
                    double mutiplicacion_total = Operaciones.multiplicar(listaNumeros2);
                    System.out.println("La multiplicación de los números ingresados es de:" + mutiplicacion_total);
                    break;
                case 4:
                    System.out.println("Ingresa el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo número:");
                    double num2 = scanner.nextDouble();
                    double rest_division = Operaciones.dividir(num1, num2);
                    System.out.println("El resultado de la divisíon es: " + rest_division);
                    break;
                case 5:
                    System.out.println("Ingresa el número base: ");
                    double base = scanner.nextDouble();
                    System.out.println("Ingresa la potencia: ");
                    double potencia  = scanner.nextDouble();
                    double resultado_potencia = Operaciones.potenciar(base,potencia);
                    System.out.printf("El resultado de %.2f a la %.2f es : %.2f %n",base,potencia,resultado_potencia);
                    break;
                case 6:
                    System.out.println("Ingresa el número: ");
                    double root = scanner.nextDouble();
                    if (root <0){
                        root = -(root);
                    }
                    double result_root = Operaciones.raices(root);
                    System.out.printf("El resultado de la raiz cuadrada de %.2f es: %.2f %n",root,result_root);
                    break;
                case 7:
                    System.out.println("Ingresa el primer número: ");
                    double numero1_module = scanner.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double numero2_module = scanner.nextDouble();
                    double result_module = Operaciones.modulo(numero1_module,numero2_module);
                    System.out.printf("El modulo de %.2f entre %.2f es: %.2f %n",numero1_module,numero2_module,result_module);
                    break;
                case 8:
                    System.out.println("1.Fahrenheit-Celsius\n2.Celsius-Fahrenheit\nSelecciona una opción: ");
                    double seleccion = scanner.nextDouble();
                    if (seleccion == 1){
                        System.out.println("Escribe los grados Fahrenheit: ");
                        double valor = scanner.nextDouble();
                        double result = Operaciones.celcius(valor);
                        System.out.printf("El resultado son: %.2f Celsius %n",result);
                    } else if (seleccion == 2){
                        System.out.println("Escribe los grados Celsius: ");
                        double valor = scanner.nextDouble();
                        double result = Operaciones.fahrenheit(valor);
                        System.out.printf("El resultado son: %.2f Fahrenheit %n",result);
                    }

            }
            System.out.println("Si deseas continuar marca 1, en caso contrario marca 0: ");
            int eleccion = scanner.nextInt();
            if (eleccion == 1){
                salir += 1;
            }else {
                salir = 0;
            }

        }
        System.out.println("Deseas ver los tipos de datos S/N: ");
        scanner = new Scanner(System.in);
        String sele = scanner.nextLine();
        if (sele.equalsIgnoreCase("S")||sele.equalsIgnoreCase("SI")) {
            TiposdeDatos tiposDeDatos = new TiposdeDatos();
            tiposDeDatos.ejecutar();

        }
        System.out.println("Hasta Pronto.");
    }
}