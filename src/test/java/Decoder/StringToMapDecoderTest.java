package Decoder;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringToMapDecoderTest {

    private StringToMapDecoder mapDecoder;

    @BeforeAll
    public void testSetup() throws Exception {
        mapDecoder = new StringToMapDecoder();
    }

    @Test
    public void decodeMap() throws Exception {
        //given
        final String input = "one=1&two=2";

        //when
        Map<String, String> result = mapDecoder.decode(input);

        //then
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("one", "1");
        expected.put("two", "2");

        assertEquals(expected, result);
    }
}
