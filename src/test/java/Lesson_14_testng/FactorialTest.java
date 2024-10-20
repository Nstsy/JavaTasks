package test.java.Lesson_14_testng;

import main.java.Lesson_14_testng.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    Factorial factorial = new Factorial();

    @Test
    public void testFactorialPositive() {
        Assert.assertEquals(120, factorial.getFactorial(5), "Факториал 5 должен быть 120");
    }

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(1, factorial.getFactorial(1), "Факториал 0 должен быть 1");
    }

    @Test
    public void testFactorialBig() {
        Assert.assertEquals(3628800, factorial.getFactorial(10), "Факториал 10 должен быть 3628800");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        factorial.getFactorial(-1);
    }
}
