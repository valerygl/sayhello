import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.Assert;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class Greeting3Test extends OutputTest {

    // Write a Greeter class with greet function that receives a name as input and outputs Hello <name>.
    // The signature of greet should not change throughout the kata.
    // You are allowed to construct Greeter object as you please.
    @Test
    public void helloPrint() {
        String textline = "testname";
        Greeting3.printGreeting(textline);

        System.out.println("output = " + output);
        System.out.println("output.toString() = " + output.toString());
        System.out.println("textline = " + textline);
        // Assert.assertEquals("Hello " + textline, output.toString());
    }
}