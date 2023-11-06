package ProgramIntro;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class Test2Test {

    @Test
    public void testGetLineCount(){
        int expected = 5;
        int actual = Test2.getLineCount();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetCharacterCount(){
        int expected = 5;
        int actual = Test2.getCharacterCount();
        assertEquals(expected, actual);
    }
    @Test
    public  void testGetWordCount(){
        String expected = "hej";
        String actual = Test2.getWordCount();
        assertEquals(expected, actual);
    }
}
