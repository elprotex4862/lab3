
package laboratorio9s;
import java.util.*;
import java.util.Random;

public class lab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("¿Cuantos dardos? ");
        int numerodeDardos = scanner.nextInt();
        int dardosEnElCirculo = 0;

        for (int i = 0; i < numerodeDardos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (Math.sqrt(x * x + y * y) <= 1) {
                dardosEnElCirculo++;
            }
        }

        double aproximacion = 4.0 * dardosEnElCirculo / numerodeDardos;
        aproximacion = Math.round(aproximacion * 10000) / 10000.0;

        System.out.println("Numero de dardos = " + numerodeDardos);
        System.out.println("Dardos caidos dentro del circulo unitario = " + dardosEnElCirculo);
        System.out.printf("Pi aproximado = "+ aproximacion );
    }
}
