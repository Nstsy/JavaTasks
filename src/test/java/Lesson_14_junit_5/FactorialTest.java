package test.java.Lesson_14_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FactorialTest {
    Factorial factorial = new Factorial();
    @Test
    public void testFactorialPositive() {
        Assertions.assertEquals(120, factorial.getFactorial(5), "Факториал 5 должен быть 120");
    }
    @Test
    public void testFactorialZero() {
        Assertions.assertEquals(1, factorial.getFactorial(0), "Факториал 0 должен быть 1");
    }

    @Test
    public void testFactorialBigNumber() {
        Assertions.assertEquals(3628800, factorial.getFactorial(10), "Факториал 10 должен быть 3628800");
    }

    @Test
    public void testFactorialNegative() {
        Assertions.assertThrows(IllegalArgumentException.class,  () -> factorial.getFactorial(-1), "Число должно быть больше 0");
    }
}
