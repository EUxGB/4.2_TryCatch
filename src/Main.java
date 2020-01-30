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
                if (expr < 0) {
                    throw new Exception();

                }
                double result = sqrt(expr);
                System.out.println("Квадратный корень числа: " + expr + "  =  " + result+"\n");

            } catch (InputMismatchException e) {

                System.out.println("Это не число:      "+e.getMessage()+"    "+e.getStackTrace()[2]);
                System.out.println("Попробуй снова: "+"\n");
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Введено отрицательное число :     "+e.getMessage()+"    "+e.getStackTrace()[0]);
                System.out.println("Попробуй снова: "+"\n");



            }


        }
    }


    public static double sqrt(double n) {
        double result = Math.sqrt(n);
        return result;
    }
}

