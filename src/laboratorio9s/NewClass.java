/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio9s;

/**
 *
 * @author papan
 */
public class NewClass {
    
}
public class Calculadora {

    // Método para verificar si un número es primo
    public static void esPrimo(int numero) {
        int primo,suma=0;
        for(int i=1;i<=numero;i++){
            primo=numero%i;
            if(primo==0)
                suma=suma+1;
        }
        if(suma<=2)
            System.out.print("el numero es primo");
        else 
            System.out.print("el numero no es primo");
    }

    // Método para encontrar los divisores de un número
    public static void imprimirDivisores(int numero) {
        System.out.println("Los divisores de " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }

    //Método para calcular el factorial de un número
    public static int factorial(int numero) {
        int factorial=1;
    for (int i=1;i<=numero;i++)
        factorial=factorial*i;
    return factorial;
    }
    //numero perfecto
    public static int perfecto(int numero){
    int divisores;
        for(int i=1;i<numero;i++)
            divisores=numero%i;
        
    }
}
