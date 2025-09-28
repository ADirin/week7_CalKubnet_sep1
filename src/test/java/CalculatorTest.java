import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
Calculator calc = new Calculator();
    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(3, calc.add(1, 2));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(3, calc.subtract(5, 2));
    }
}