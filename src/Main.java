public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("Результат сложения: ");
        calculator.addition(2,3);
        System.out.print("Результат вычитания: ");
        calculator.subtraction(6,3);
        System.out.print("Результат умножения: ");
        calculator.multiplication(5,5);
        System.out.print("Результат деления: ");
        calculator.division(10,5);
    }
}
