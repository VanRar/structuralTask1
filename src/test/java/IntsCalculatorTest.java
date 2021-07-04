import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

class IntsCalculatorTest {
    IntsCalculator intsCalculator = new IntsCalculator();

    @org.junit.jupiter.api.Test
    void sum() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int result = intsCalculator.sum(i, j);
                int expected = i + j;
                Assert.assertEquals(expected, result);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void mult() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int result = intsCalculator.mult(i, j);
                int expected = i * j;
                Assert.assertEquals(expected, result);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void pow() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int result = intsCalculator.pow(i, j);
                int expected = (int) Math.pow(i, j);
                Assert.assertEquals(expected, result);
            }
        }
    }
}