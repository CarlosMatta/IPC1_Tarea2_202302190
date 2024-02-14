/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2;

/**
 *
 * @author famil
 */
import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        double resultado = 0, n1, n2;
        String operador, respuesta;
        int Numeros;
        while (true) {
            System.out.println("Calculadora");
            System.out.println("Ingrese 'S' para salir.");
            System.out.println("Ingrese la cantidad de números a operar (0 para reiniciar): ");
            Numeros = ingreso.nextInt();
            if (Numeros <= 0) {
                System.out.println("...");
                continue;
            }
            System.out.print("Ingrese el primer número: ");
            n1 = ingreso.nextDouble();

            for (int i = 1; i < Numeros; i++) {
                System.out.println("Ingrese el siguiente número: ");
                n2 = ingreso.nextDouble();
                System.out.println("Ingrese un operador: +, -, *, /");
                operador = ingreso.next();
                switch (operador) {
                    case "+":
                        resultado = n1 + n2;
                        break;
                    case "-":
                        resultado = n1 - n2;
                        break;
                    case "*":
                        resultado = n1 * n2;
                        break;
                    case "/":
                        if (n2 != 0) {
                            resultado = n1 / n2;
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                            i--;
                        }
                        break;
                    default:
                        System.out.println("Operador no válido.");
                        i--;
                        break;
                }
                System.out.println("Resultado: " + resultado);
                n1 = resultado;
            }
            System.out.println("Resultado final: " + resultado);
            System.out.print("¿Desea realizar otra operación? (Sí/No): ");
            respuesta = ingreso.next();
            if (!respuesta.equalsIgnoreCase("Sí")) {
                System.out.println("Calculadora cerrada.");
                break;
            }
        }
        ingreso.close();

    }
}
