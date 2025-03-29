import com.example.MainClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MainClassTest {

    @Test
    void testAddition() {
        MainClass mainClass = new MainClass();
        int result = mainClass.add(2, 3);
        assertEquals(5, result, "The addition method should return the sum of two numbers");
    }

    @Test
    void testSubtraction() {
        MainClass mainClass = new MainClass();
        int result = mainClass.subtract(2, 3);
        assertEquals(-1, result, "The subtract method should return the Subtraction of two numbers");
    }

    @Test
    void testMultiply() {
        MainClass mainClass = new MainClass();
        int result = mainClass.multiply(2, 3);
        assertEquals(6, result, "The multiply method should return the multiply of two numbers");
    }

    @Test
    void testDivide() {
        MainClass mainClass = new MainClass();
        int result = mainClass.divide(4, 2);
        assertEquals(2, result, "The divide method should return the division of two numbers");
    }

    @ParameterizedTest
    @CsvSource({
        "2, 3, 5",
        "-2, -3, -5",
        "0, 5, 5"
    })
    void testAdditionParameterized(int a, int b, int expected) {
        MainClass mainClass = new MainClass();
        int result = mainClass.add(a, b);
        assertEquals(expected, result, "The addition method should return the correct sum");
    }

    @Test
    void testDivisionByZero() {
        MainClass mainClass = new MainClass();
        assertThrows(ArithmeticException.class, () -> mainClass.divide(10, 0), "Division by zero should throw ArithmeticException");
    }
}