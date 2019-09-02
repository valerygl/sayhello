import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class OutputTest {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
        System.out.println("Before called");
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.out.println("After called");
    }
}

