import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class Greeting3Test {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    // Write a Greeter class with greet function that receives a name as input and outputs Hello <name>.
    // The signature of greet should not change throughout the kata.
    // You are allowed to construct Greeter object as you please.
    @Test
    public static void printsHelloName() throws Exception {
        Greeting3.printGreeting("Vasily");
        assertEquals("Hello Vasily", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}