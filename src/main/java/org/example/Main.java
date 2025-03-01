package org.example;
import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void Main (String[] args) {

        TiposdeDatos tiposDeDatos = new TiposdeDatos();
        tiposDeDatos.ejecutar();

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
                case 5://Aqui va potencia diego
                    break;
                case 6://Aqui va raiz cuadrada
                    break;
                case 7: //Aqui va modulo
                    break;
                case 9: //Este es para salir, ne avisa cuando termine su parte para yo hacer esta parte.
            }
            System.out.println("Si deseas continuar marca 1, en caso contrario marca 0: ");
            int eleccion = scanner.nextInt();
            if (eleccion == 1){
                salir += 1;
            }else {
                salir = 0;
            }

        }
    }
}