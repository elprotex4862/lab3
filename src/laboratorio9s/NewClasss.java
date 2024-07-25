package laboratorio9s;
import java.util.Scanner;

public class NewClasss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de primos que desea imprimir:");
        int cantidad = scanner.nextInt();
        int i = 0;
        int numero = 2;
        System.out.print("sus numero primos son ");
        while(i < cantidad) {
            if(primo(numero) == 0) {
                System.out.print(numero+",");
                i++;
            }
            numero++;
        }
    }

    private static int primo(int num) {
        int numero = 0;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                numero++;
            }
        }
        return numero;
    }
}
