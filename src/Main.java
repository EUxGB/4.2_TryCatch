import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public Main(String expr) {
    }

    public static void main(String[] args)  {
        for (; ; ) {
            System.out.print("Введите число :");


            try {
                Scanner scanner = new Scanner(System.in);
                double expr = scanner.nextDouble();
                if (expr == 0) {
                    break;
                }
                double result = sqrt(expr);
                System.out.println("Квадратный корень числа: " + expr + "=" + result);

            } catch (Exception e) {
                System.out.println("Плохое выражение: "+e.getMessage());
                System.out.println("Попробуй снова: ");



            }


        }
    }


    public static double sqrt(double n) {
        double result = Math.sqrt(n);
        return result;
    }
}

