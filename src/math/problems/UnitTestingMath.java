package math.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingMath {
    public static void main(String[] args) {

        //Apply Unit testing into each classes and methods in this package.

        try {

            Assert.assertEquals(Factorial.factorial(5), 120);

            System.out.println("Passed");

        } catch (AssertionError ar) {

            System.out.println("Failed");
        }


        Fibonacci fs = new Fibonacci();
    }
}
