package homework;

public class Main {
    public static void main(String[] args) {
        /* Task1
Создать класс Calculator, способный выполнять два арифметических действия
- сложение двух чисел, вычитание двух чисел а также сложение трех чисел
и вычитание трех чисел. Калькулятор должен работать как для целых чисел,
так и для чисел с запятой. (т.е. в классе надо создать соответствующие
методы и затем вызывать их в методе main) */

        Calculator calculator = new Calculator();

        int resultPlus2 = calculator.plus(5,6);
        System.out.println("The sum of these two numbers = "+resultPlus2);

        int resultMinus3 = calculator.minus(99,6,25);
        System.out.println("The subtracting of these three numbers = "
                            + resultMinus3);

        double resultMinus2double = calculator.minus(78.5, 4.5,44.2);
        System.out.println("The subtracting of these two numbers = "
                            + (String.format("%.2f",resultMinus2double)));

        double resultPlus3double = calculator.plus(6.8, 4.9, 7.1);
        System.out.println("The sum of these two numbers = "
                           + (String.format("%.2f",resultPlus3double)));

    }
}
