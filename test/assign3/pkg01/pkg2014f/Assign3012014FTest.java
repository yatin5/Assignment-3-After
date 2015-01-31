package assign3.pkg01.pkg2014f;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author
 */
public class Assign3012014FTest {

    // Streams used to hijack System.out and System.err
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    public Assign3012014FTest() {
    }

    @Before
    public void setUp() {
        // Hijacking the Out and Err Streams
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        // Resetting the Out and Err Streams
        System.setOut(null);
        System.setErr(null);
        System.setIn(null);
    }

    /**
     * Test of doExercise1 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise1High() {
        String fakeInput = "60\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String expected = "That's too high!";
        String[] unexpected = {"That's too low!", "Lucky number seven!", "Thank you!"};
        
        Assign3012014F.doExercise1();
        
        String actual = outContent.toString();
        assertTrue("Checking if \"" + actual + "\" contains: \"" + expected + "\"",
                actual.contains(expected));
        for (String u : unexpected) {
            assertFalse("Making sure \"" + actual + "\" does not contain: \"" + expected + "\"",
                    actual.contains(u));
        }        
    }

    /**
     * Test of doExercise1 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise1Low() {
        String fakeInput = "0\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String expected = "That's too low!";
        String[] unexpected = {"That's too high!", "Lucky number seven!", "Thank you!"};
        Assign3012014F.doExercise1();
        String actual = outContent.toString();
        assertTrue("Checking if \"" + actual + "\" contains: \"" + expected + "\"",
                actual.contains(expected));
        for (String u : unexpected) {
            assertFalse("Making sure \"" + actual + "\" does not contain: \"" + expected + "\"",
                    actual.contains(u));
        }
    }

    /**
     * Test of doExercise1 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise1Lucky() {
        String fakeInput = "7\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String expected = "Lucky number seven!";
        String[] unexpected = {"That's too high!", "That's too low!", "Thank you!"};
        Assign3012014F.doExercise1();
        String actual = outContent.toString();
        assertTrue("Checking if \"" + actual + "\" contains: \"" + expected + "\"",
                actual.contains(expected));
        for (String u : unexpected) {
            assertFalse("Making sure \"" + actual + "\" does not contain: \"" + expected + "\"",
                    actual.contains(u));
        }
    }

    /**
     * Test of doExercise1 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise1Other() {
        String fakeInput = "6\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String expected = "Thank you!";
        String[] unexpected = {"That's too high!", "That's too low!", "Lucky number seven!"};
        Assign3012014F.doExercise1();
        String actual = outContent.toString();
        assertTrue("Checking if \"" + actual + "\" contains: \"" + expected + "\"",
                actual.contains(expected));
        for (String u : unexpected) {
            assertFalse("Making sure \"" + actual + "\" does not contain: \"" + expected + "\"",
                    actual.contains(u));
        }
    }

    /**
     * Test of doExercise2 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise2High() {
        String fakeInput = "C\n28\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String expected = "Please pick a number between 1-26.";
        String[] unexpected = {"That's the right number/letter.", "Try again."};
        
        Assign3012014F.doExercise2();
        String actual = outContent.toString();

        assertTrue("Checking if \"" + actual + "\" contains: \"" + expected + "\"",
                actual.contains(expected));
        for (String u : unexpected) {
            assertFalse("Making sure \"" + actual + "\" does not contain: \"" + expected + "\"",
                    actual.contains(u));
        }
    }
    
    /**
     * Test of doExercise2 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise2Low() {
        String fakeInput = "C\n-4\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String expected = "Please pick a number between 1-26.";
        String[] unexpected = {"That's the right number/letter.", "Try again."};
        
        Assign3012014F.doExercise2();
        String actual = outContent.toString();

        assertTrue("Checking if \"" + actual + "\" contains: \"" + expected + "\"",
                actual.contains(expected));
        for (String u : unexpected) {
            assertFalse("Making sure \"" + actual + "\" does not contain: \"" + expected + "\"",
                    actual.contains(u));
        }
    }
    
    /**
     * Test of doExercise2 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise2Upper() {
        String fakeInput = "C\n3\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String expected = "That's the right number/letter.";
        String[] unexpected = {"Please pick a number between 1-26.", "Try again."};
        
        Assign3012014F.doExercise2();
        String actual = outContent.toString();

        assertTrue("Checking if \"" + actual + "\" contains: \"" + expected + "\"",
                actual.contains(expected));
        for (String u : unexpected) {
            assertFalse("Making sure \"" + actual + "\" does not contain: \"" + expected + "\"",
                    actual.contains(u));
        }
    }
    
    /**
     * Test of doExercise2 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise2Lower() {
        String fakeInput = "c\n3\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String expected = "That's the right number/letter.";
        String[] unexpected = {"Please pick a number between 1-26.", "Try again."};
        
        Assign3012014F.doExercise2();
        String actual = outContent.toString();

        assertTrue("Checking if \"" + actual + "\" contains: \"" + expected + "\"",
                actual.contains(expected));
        for (String u : unexpected) {
            assertFalse("Making sure \"" + actual + "\" does not contain: \"" + expected + "\"",
                    actual.contains(u));
        }
    }
    
    /**
     * Test of doExercise2 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise2Wrong() {
        String fakeInput = "C\n4\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String expected = "Try again.";
        String[] unexpected = {"Please pick a number between 1-26.", "That's the right number/letter."};
        
        Assign3012014F.doExercise2();
        String actual = outContent.toString();

        assertTrue("Checking if \"" + actual + "\" contains: \"" + expected + "\"",
                actual.contains(expected));
        for (String u : unexpected) {
            assertFalse("Making sure \"" + actual + "\" does not contain: \"" + expected + "\"",
                    actual.contains(u));
        }
    }

    /**
     * Test of doExercise3 method, of class Assign3012014F.
     */
    @Test
    public void testDoExercise3() {
        String fakeInput = "123.45\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        System.setIn(new ByteArrayInputStream(fakeInputArray));
        
        String[] expected = {"$16.05", "$139.50"};
        
        Assign3012014F.doExercise3();

        String actual = outContent.toString();

        for (String e : expected)
        assertTrue("Checking if \"" + actual + "\" contains: \"" + e + "\"",
                actual.contains(e));
    }

}
