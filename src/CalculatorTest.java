import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void addition() {
        Calculator calculator = new Calculator();
        int actual = calculator.addition(2,3);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtraction(6,3);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiplication(5,5);
        int expected = 25;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void division() {
        Calculator calculator = new Calculator();
        int actual = calculator.division(10,5);
        int expected = 2;
        assertEquals(expected,actual);
    }
}