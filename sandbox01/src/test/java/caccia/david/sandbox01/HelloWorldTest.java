package caccia.david.sandbox01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by abe on 4/21/2016.
 */
public class HelloWorldTest {

    @Test
    public void testMessage()
    {
        String message = "test message";
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.givesMessage(message);
        // No exceptions.
        // We could capture stdout and confirm the message was sent.
    }

}