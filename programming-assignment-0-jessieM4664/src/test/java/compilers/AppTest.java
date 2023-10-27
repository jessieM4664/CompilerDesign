package compilers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Programming Assignment 0
 * CSC416/565 - Compilers
 * West Chester University
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void helloWorldOutput() {
        assertEquals("Hello World", App.helloWorld() );
    }

    @Test
    public void helloArgOutput() {
        assertEquals("Hello Compiler Writer!", App.helloCustom("Compiler Writer!") );
    }

    @Test
    public void addTwoNumbers() {
        assertEquals(5, App.addTwoNumbers(2,3) );
    }
}
