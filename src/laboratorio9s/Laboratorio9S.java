
package laboratorio9s;
import java.util.*;
public class Laboratorio9S {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero,i,suma = 0,hola;
        hola=sc.nextInt();
        esPrimo(hola);
        System.out.println("EL factorial del numero es"+factorial(hola));
        System.out.println("Ingrese su numero a comprobar");
        numero=sc.nextInt();

        for(i = 1; i < numero; i++) {
            if(numero % i == 0) {
                suma=suma+i;
            }
        }

        if(suma == numero) {
            System.out.println("El numero " + numero + " es un numero perfecto.");
        }
        else 
            System.out.println("El numero " + numero + " no es un numero perfecto y la suma de sus divisores propios es "+suma);
    }
    public static int factorial(int numero) {
        int factorial=1;
    for (int i=1;i<=numero;i++){
        factorial=factorial*i;
        }
    return factorial;
    }
    public static void esPrimo(int numero) {
        int primo,suma=0;
        for(int i=1;i<=numero;i++){
            primo=numero%i;
            if(primo==0)
                suma=suma+1;
        }
        if(suma<=2)
            System.out.println("el numero es primo");
        else 
            System.out.println("el numero no es primo");
    }
}
