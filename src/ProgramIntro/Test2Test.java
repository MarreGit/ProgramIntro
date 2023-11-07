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
    public  void testGetLine(){
        String expected = "stop";
        String actual = Test2.getLine();
        assertEquals(expected, actual);
    }
}
