
package laboratorio9s;

import java.util.*;

public class lab11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los coeficientes (c3,c2,c1,c0) del polinomio: ");
        double c3 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        double c0 = scanner.nextDouble();

        System.out.println("Ingrese los puntos finales a y b: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double raiz = biseccion(a, b, c3, c2, c1, c0);
        System.out.println("La raíz es: "+ raiz);
        System.out.println("p(raiz) = "+ polinomio(raiz, c3, c2, c1, c0));
    }

    public static double biseccion(double a, double b, double c3, double c2, double c1, double c0) {
        if (polinomio(a, c3, c2, c1, c0) * polinomio(b, c3, c2, c1, c0) >= 0) {
            System.out.println("No puedes asumir que hay una raíz entre a y b");
            return -1;
        }

        double c = a;
        for (int i = 0; i < 200; i++) {
            c = (a + b) / 2;

            if (polinomio(c, c3, c2, c1, c0) == 0.0)
                break;

            else if (polinomio(c, c3, c2, c1, c0) * polinomio(a, c3, c2, c1, c0) < 0)
                b = c;
            else
                a = c;
        }
        return c;
    }

    public static double polinomio(double x, double c3, double c2, double c1, double c0) {
        return c3 * Math.pow(x, 3) + c2 * Math.pow(x, 2) + c1 * x + c0;
    }
}
