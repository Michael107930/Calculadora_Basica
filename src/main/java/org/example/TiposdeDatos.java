package org.example;

import java.util.Scanner;

public class TiposdeDatos {

        public  void ejecutar(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("____[Ejemplos de tipos de Datos]____");
            System.out.println();
            System.out.println("[Datos Primitivos].");
            System.out.println("Los datos primitivos son los tipos de datos basicos que proporciona un lenguaje de programacion.");
            System.out.println("Son la unidad de procesamiento mas pequeña que puede utilizar un programador.");
            System.out.println();
            //Tipo de dato (int)
            System.out.println("*--Int(entero)--.");
            System.out.println("Un numero entero es un numero que puede ser positivo, negativo o cero, pero sin parte decimal.");
            System.out.print(" Porfavor ingrese un numero entero(int): ");
            int numeroEntero = scanner.nextInt();
            System.out.println();
            //Tipo de dato (double)
            System.out.println("*--Double(decimal)--.");
            System.out.println("Un numero decimal es un numero que tiene una parte entera y una parte decimal. Se utilizan para representar numeros que son más pequeños que la unidad. ");
            System.out.print("Ingrese un numero decimal(double): ");
            double numeroDecimal = scanner.nextDouble();
            System.out.println();
            //Tipo de dato (float)
            System.out.println("*--Float(numeros con decimales)--");
            System.out.println("El tipo de dato float es un tipo de datos numerico que almacena numeros con decimales, es decir, numeros reales. Se utiliza para representar valores que pueden ser positivos o negativos");
            System.out.print("Ingrese un numero decimal (float): ");
            float numeroFloat = scanner.nextFloat();
            System.out.println();
            //Tipo de dato (char)
            System.out.println("*--Char (caracter)--");
            System.out.println("El tipo de dato char  es un tipo de dato que se utiliza para almacenar un caracter, como una letra, un digito, un signo de puntuacion o un espacio. ");
            System.out.print("Ingrese un caracter(char)(Una letra): ");
            char charcaracter = scanner.next().charAt(0);
            System.out.println();
            //Tipo de dato (booleano)
            System.out.println("*--Boolean (verdadero|true| y falso|false|--");
            System.out.println("El tipo de dato booleano es un tipo de dato que representa valores de verdad, como verdadero (true) o falso (false)");
            System.out.print("Ingrese un valor booleano (true/false): ");
            boolean caaracterBooleano = scanner.nextBoolean();
            System.out.println();
            //Tipo de dato (Short)
            System.out.println("*--Short (numero corto)--");
            System.out.println("El tipo de dato short es un tipo de dato primitivo que representa un entero de 16 bits con signo. Se utiliza para ahorrar memoria en grandes matrices.");
            System.out.print("Ingrese un numero corto (short): ");
            short numeroShort = scanner.nextShort();
            System.out.println();
            //Tipo de dato (long)
            System.out.println("*--Long (numero largo)--");
            System.out.println("El tipo de dato long en Java es un entero de 64 bits que se usa para almacenar numeros con signo. Se utiliza cuando se necesita un rango de valores mas amplio que el que proporciona el tipo de dato int");
            System.out.print("Ingrese un numero largo (long): ");
            long numeroLong = scanner.nextLong();
            System.out.println();
            //Tipo de dato (byte)
            System.out.println("*--Byte--");
            System.out.println("En Java, el tipo de dato byte es un entero de 8 bits con signo que puede almacenar valores entre -128 y 127.");
            System.out.print("Ingrese un numero byte (byte): ");
            byte numeroByte = scanner.nextByte();
            System.out.println();
            System.out.println("[Operadores]");
            System.out.println("Los operadores en programacion son simbolos o palabras reservadas que indican las operaciones que se deben realizar en una expresion.");
            System.out.println("Son fundamentales para construir expresiones y manipular datos");
            System.out.println();
            System.out.println("[*--Operadores Atitmeticos--");
            //Operador suma
            System.out.println("|SUMA|");
            System.out.print("Por favor ingrese el primer numero: ");
            double num1 = scanner.nextDouble();
            System.out.print(" Porfavor ingrese el segundo numero: ");
            double num2 = scanner.nextDouble();
            double suma = num1 + num2;
            System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
            //Operador resta
            System.out.println("|RESTA|");
            System.out.print("Por favor ingrese el primer numero: ");
            double num3 = scanner.nextDouble();
            System.out.print(" Por favor ingrese el segundo numero: ");
            double num4 = scanner.nextDouble();
            double resta = num3 + num4;
            System.out.println("La resta de " + num3 + " - " + num4 + " es: " + resta);
            //Operador multiplicacion
            System.out.println("|MULTIPLICACION|");
            System.out.print("Por favor ingrese el primer numero: ");
            double num5 = scanner.nextDouble();
            System.out.print(" Porfavor Ingrese el segundo numero: ");
            double num6 = scanner.nextDouble();
            double multiplicacion = num5 * num6;
            System.out.println("La multiplicacion de " + num5 + " x " + num6 + " es: " + multiplicacion);
            //Operador divicion
            System.out.println("|DIVICION|");
            System.out.print("Por favor ingrese el primer numero: ");
            double num7 = scanner.nextDouble();
            System.out.print(" Porfavor Ingrese el segundo numero: ");
            double num8 = scanner.nextDouble();
            double divicion = num7 / num8;
            System.out.println("La divicion de " + num7 + " / " + num8 + " es: " + divicion);
            //Operador modulo
            System.out.println("|MODULO|");
            System.out.print("Por favor ingrese el primer numero (dividendo): ");
            int num9 = scanner.nextInt();
            System.out.print("Por favor ingrese el segundo numero (divisor): ");
            int num10 = scanner.nextInt();
            if (num10 == 0) {
                System.out.println("Error: No es posible dividir entre cero.");
            } else {
                int modulo = num9 % num10;
                System.out.println("El modulo de " + num9 + " % " + num10 + " es: " + modulo);
            }
            System.out.println();
            System.out.println("[*--Operadores Relacionales --");
            System.out.print("Ingrese el primer nuero entero: ");
            int num11 = scanner.nextInt();
            System.out.print("Ingrese el segundo número entero: ");
            int num12 = scanner.nextInt();
            //Operador mayor
            boolean esMayor = num11 > num12;
            //Operador menor
            boolean esMenor = num11 < num12;
            //Operador igual
            boolean esIgual = num11 == num12;
            //Operador diferente
            boolean esDiferente = num11 != num12;
            //Operdor menor=
            boolean esMayorIgual = num11 >= num12;
            //Operador mayor=
            boolean esMenorIgual = num11 <= num12;
            System.out.println();
            System.out.println("[*--Operadores Logicos --");
            System.out.print("Ingrese el primer valor booleano (true o false): ");
            boolean valor1 = scanner.nextBoolean();
            System.out.print("Ingrese el segundo valor booleano (true o false): ");
            boolean valor2 = scanner.nextBoolean();
            //Operador and
            boolean resultadoAnd = valor1 && valor2;
            //Operador or
            boolean resultadoOr = valor1 || valor2;
            //Operador not
            boolean resultadoNot1 = !valor1;
            boolean resultadoNot2 = !valor2;
            System.out.println();
            System.out.println("[Estructuras de Control]");
            System.out.println("[Las estructuras de control son instrucciones que controlan el orden de ejecucion de las acciones de un programa");
            System.out.println("Son fundamentales en la programacion, ya que permiten tomar decisiones, repetir acciones y ejecutar acciones condicionales");
            System.out.println();
            System.out.println("*--Estructura If-Else--");
            //if-else
            System.out.print("Ingrese un caracter: ");
            char caracter = scanner.next().charAt(0);
            if (Character.isLetter(caracter)) {
                System.out.println("Ingresaste una letra.");
            } else if (Character.isDigit(caracter)) {
                System.out.println("Ingresaste un número.");
            } else {
                System.out.println("Ingresaste un símbolo especial.");
            }
            System.out.println();
            System.out.println("*--Estructura Switch");
            // switch
            System.out.print("Ingrese una vocal");
            char vocal = scanner.next().toLowerCase().charAt(0);
            switch (vocal) {
                case 'a':
                    System.out.println("Ingresaste la letra 'a'.");
                    break;
                case 'e':
                    System.out.println("Ingresaste la letra 'e'.");
                    break;
                case 'i':
                    System.out.println("Ingresaste la letra 'i'.");
                    break;
                case 'o':
                    System.out.println("Ingresaste la letra 'o'.");
                    break;
                case 'u':
                    System.out.println("Ingresaste la letra 'u'.");
                    break;
                default:
                    System.out.println("Ingresaste otra letra.");
            }
            System.out.println();
            System.out.println("*--Estructura Bucle For--");
            //bucle for
            System.out.print("Ingrese hasta qué número contar: ");
            int limiteFor = scanner.nextInt();
            System.out.println("Contando hasta " + limiteFor + ":");
            for (int i = 1; i <= limiteFor; i++) {
                System.out.println(i);
            }
            System.out.println("*--Estructura While--");
            //while
            int numeroWhile;
            do {
                System.out.print("Ingrese un número mayor 60 para salir del bucle: ");
                numeroWhile = scanner.nextInt();
            } while (numeroWhile <= 10);
            System.out.println("¡Correcto! FIN  " + numeroWhile);
            System.out.println();
            System.out.println("Número entero: " + numeroEntero);
            System.out.println("Número float: " + numeroFloat);
            System.out.println("Número double: " + numeroDecimal);
            System.out.println("Carácter ingresado: " + charcaracter);
            System.out.println("Valor booleano: " + caaracterBooleano);
            System.out.println("Número short: " + numeroShort);
            System.out.println("Número long: " + numeroLong);
            System.out.println("Número byte: " + numeroByte);
            System.out.println();
            System.out.println(num11 + " > " + num12 + " = " + esMayor);
            System.out.println(num11 + " < " + num12 + " = " + esMenor);
            System.out.println(num11 + " == " + num12 + " = " + esIgual);
            System.out.println(num11 + " != " + num12 + " = " + esDiferente);
            System.out.println(num11 + " >= " + num12 + " = " + esMayorIgual);
            System.out.println(num11 + " <= " + num12 + " = " + esMenorIgual);
            System.out.println();
            System.out.println("AND (&&): " + resultadoAnd);
            System.out.println("OR  (||): " + resultadoOr);
            System.out.println("NOT (!valor1): " + resultadoNot1);
            System.out.println("NOT (!valor2): " + resultadoNot2);
            scanner.close();
        }
    }


