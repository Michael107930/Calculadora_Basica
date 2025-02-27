package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A TU CALCULADORA");
        System.out.println("Digita tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Menu.mostrarMenu();
        System.out.println("Ok "+name+" selecciona la opcion que deseas hacer: ");
        int elec = scanner.nextInt();
        switch (elec){
            case 1:
                List<Double> listaNumeros = new ArrayList<>();
                System.out.println("¿Cuantos numeros deseas sumar?");
                int cantN = scanner.nextInt();
                int i = 1;
                while (cantN+1!=i){
                    System.out.println("Digite su numero "+i+": ");
                    listaNumeros.add(scanner.nextDouble());
                    i=i+1;
                }
                double sumaTotal = Operaciones.sumar(listaNumeros);
                System.out.println("La suma de los numeros ingresados es de: "+sumaTotal);
        }
    }
}