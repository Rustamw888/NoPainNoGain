package org.example;

public class Main {

    /*
     * Необходимо реализовать метод на java или kotlin в отдельном классе,
     * который бы на вход принимал int a, int b и выдавал бы следующие значения:
     * если a > b, то значение double c = (a - b)/2,
     * если a < b, то значение double c = b/a,
     * если a = b, то double c = a,
     * при делении на 0 необходимо возвращать текст ошибки "Ошибка при делении на ноль".
     * Данный метод также необходимо покрыть тестами в отдельном классе.
     */

    public static void main(String[] args) {
//        System.out.println(conversionMethod(0, 50));
        eval(0, 10);
    }

//    public static String conversionMethod(Integer a, Integer b) {
//        if (a > b) {
//            Double c = ((a - b)/2) * 1.0;
//            return c.toString();
//        }
//        else if (a < b) {
//            if (a != 0) {
//                Double c = b/a * 1.0;;
//                return c.toString();
//            } else {
//                return "Ошибка при делении на ноль";
//            }
//        }
//        else {
//            Double c = Double.valueOf(a);
//            return c.toString();
//        }
//    }

    public static double eval(int a, int b) {
        double c;
        if (a > b) {
            c = div((a - b), 2);
        } else if (a < b) {
            c = div(b, a);
        } else {
            c = a;
        }
        System.out.println(c);
        return c;
    }

    private static double div(int divisible, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Ошибка при делении на ноль");
        }
        return (double) divisible / divisor;
    }
}
