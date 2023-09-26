package seminars.first.Calculator;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
            if(num < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    // purchaseAmount - сумма покупки
    // discountAmount - процент скидки
    // Метод должен возвращать сумму покупки со скидкой
    //*Задание 1. * В классе Calculator создайте метод calculateDiscount,
//        который принимает сумму покупки и процент скидки и возвращает
//        сумму с учетом скидки. Ваша задача - проверить этот метод
//        с использованием библиотеки AssertJ.
//        Если метод calculateDiscount получает недопустимые аргументы,
//        он должен выбрасывать исключение ArithmeticException.
//        Не забудьте написать тесты для проверки этого поведения.
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0)
            throw new ArithmeticException ("cумма покупки не положительна");
        if (discountAmount < 0 || discountAmount >100)
            throw new ArithmeticException ("процент скидки должен быть от 0 до 100");
        return purchaseAmount - purchaseAmount*discountAmount/100;
    }



}