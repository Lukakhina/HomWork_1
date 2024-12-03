package HomeWork18.CalculatorMein;

public class CalculatorAppTeacher {
    public static void main(String[] args) {

        double sum = Calculator.add(1, 10);
        System.out.println(sum);

        // Ctrl + B (курсов на название метода, который вызываем)
        // public static double divide(double a, double b) - так объявляется у вас метод
        // в классе Calculator(Calculator.java). Здесь мы видим, что метод возвращает
        // значение типа double. Поэтому и переменная, в которую вы помещаете результат
        // выполнения этого метода, должна быть того же типа, то есть double.
        double divideResult = Calculator.divide(1, 0);

        // Второй вариант - явное приведение типа, в круглых скобках мы указываем
        // необходимый тип, в нашем случае - (int)
        int divide = (int) Calculator.divide(1, 0);
        System.out.println(divide);


        System.out.println("\n====== Calculator end =========== ");
        int a = 10;
        int b = 0;

        // System.out.println(a / b);

        double result;
        double x = 10.0;
        result = x / 0;

        // result:
        // Infinity - бесконечность. Бесконечно большое число
        // NaN - значение не определено (не знаю, не смог посчитать)
        System.out.println("result: " + result);

        double infinity = 1999 / 0.0;
        System.out.println("infinity: " + infinity);

        System.out.println(infinity > result); // false
        System.out.println(infinity == result); // true
        System.out.println(infinity / result); //NaM
        System.out.println(1 / infinity); // 0.0
        System.out.println(infinity + 1555000);
        System.out.println(infinity - 1000);
        System.out.println(infinity - result); // NaN

        double minusInfinity = - 1999 / 0.0;
        System.out.println("minusInfinity: " + minusInfinity);
        System.out.println(infinity > minusInfinity);

        // 1 -> 1.0
        double res1 =  1 / 5; // 0 -> 0.0
        System.out.println(res1);

        int res2 = (int) (1.0 / 5); // 0.2
        System.out.println(res2);


    }
}
