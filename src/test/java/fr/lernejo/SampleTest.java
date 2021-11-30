package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {

    private final Sample myTestSample = new Sample();

    @Test
    void negative_factorial_should_throw_IllegalArgumentException() {
        int n = -5;
        Assertions.assertThrows( IllegalArgumentException.class, () -> myTestSample.fact( n ) );
    }

    @Test
    void factorial_of_5_should_equal_120() {
        int n = 5;
        Assertions.assertEquals( 120, myTestSample.fact( n ) );
    }

    @Test
    void factorial_of_10_should_equal_3628800() {
        int n = 10;
        Assertions.assertEquals( 3628800, myTestSample.fact( n ) );
    }

    // Testing of ADD Operation
    @Test
    void addition_of_5_to_10_should_equal_15() {
        int five = 5;
        int ten = 10;
        int sum = myTestSample.op( Sample.Operation.ADD, five, ten );
        Assertions.assertEquals( 15, sum );
    }

    @Test
    void addition_of_negative_5_to_10_should_equal_5() {
        int negative_five = -5;
        int ten = 10;
        int sum = myTestSample.op( Sample.Operation.ADD, negative_five, ten );
        Assertions.assertEquals( 5, sum );
    }

    @Test
    void addition_of_5_to_negative_10_should_equal_negative_5() {
        int five = 5;
        int negative_ten = -10;
        int sum = myTestSample.op( Sample.Operation.ADD, five, negative_ten );
        Assertions.assertEquals( -5, sum );
    }

    @Test
    void addition_of_negative_5_to_negative_10_should_equal_negative_15() {
        int negative_five = -5;
        int negative_ten = -10;
        int sum = myTestSample.op( Sample.Operation.ADD, negative_five, negative_ten );
        Assertions.assertEquals( -15, sum );
    }

    // Testing of MULT Operation
    @Test
    void multiplication_of_5_to_10_should_equal_50() {
        int five = 5;
        int ten = 10;
        int product = myTestSample.op( Sample.Operation.MULT, five, ten );
        Assertions.assertEquals( 50, product );
    }

    @Test
    void multiplication_of_negative_5_to_10_should_equal_negative_50() {
        int negative_five = -5;
        int ten = 10;
        int product = myTestSample.op( Sample.Operation.MULT, negative_five, ten );
        Assertions.assertEquals( -50, product );
    }

    @Test
    void multiplication_of_5_to_negative_10_should_equal_negative_50() {
        int five = 5;
        int negative_ten = -10;
        int product = myTestSample.op( Sample.Operation.MULT, five, negative_ten );
        Assertions.assertEquals( -50, product );
    }

    @Test
    void multiplication_of_negative_5_to_negative_10_should_equal_50() {
        int negative_five = -5;
        int negative_ten = -10;
        int product = myTestSample.op( Sample.Operation.MULT, negative_five, negative_ten );
        Assertions.assertEquals( 50, product );
    }
}
