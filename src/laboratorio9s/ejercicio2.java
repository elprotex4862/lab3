
package laboratorio9s;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int coste, cantidad;
        int totalCentimos = 0;
        String continuar;

        do {
            System.out.print("Introduce el nombre del articulo: ");
            nombre = scanner.nextLine();
            System.out.print("Introduce el coste del articulo en centimos: ");
            coste = scanner.nextInt();
            System.out.print("Introduce la cantidad de articulos: ");
            cantidad = scanner.nextInt();
            // Limpiar el buffer de entrada
            scanner.nextLine(); // Consume el '\n' residual para evitar problemas con la próxima llamada a nextLine()
            totalCentimos =totalCentimos+(coste * cantidad);
            System.out.print(" ¿Desea añadir mas articulos? (si/no): ");
            continuar = scanner.nextLine();

        }
        while (continuar.equalsIgnoreCase("si"));
        double totalDolares = totalCentimos / 100;
        System.out.print("El coste total es:"+ totalDolares);

        
    }
}
