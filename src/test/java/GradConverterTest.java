import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class GradConverterTest {

    private GradConverter converter;
    @Before
    public void setUp() throws Exception{
        converter = new GradConverter();
    }

    @Test
    public void convert() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }
    @Test
    public void convert2() {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }
}