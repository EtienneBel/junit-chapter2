package junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private final Calculator _calculator = new Calculator();

    @Test
    public  void testAddition(){
        var actualResult = _calculator.add(1,1);

        Assertions.assertEquals(1, actualResult);
    }
}
