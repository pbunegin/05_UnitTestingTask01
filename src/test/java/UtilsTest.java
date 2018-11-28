import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Disabled
    @Test
    void testComputeFactorial() {
        assertEquals(120,Utils.computeFactorial(5));
        assertEquals(1,Utils.computeFactorial(1));
        assertNotEquals(0,Utils.computeFactorial(1));
        assertThrows(NumberFormatException.class,()->Utils.computeFactorial(Integer.parseInt("sfdg")));
        assertThrows(ArithmeticException.class,()->Utils.computeFactorial(0));
        assertThrows(ArithmeticException.class,()->Utils.computeFactorial(-5));
    }

    @Test
    void testConcatenateWords() {
        assertNotNull(Utils.concatenateWords("3","sxth"));
        assertEquals("ab",Utils.concatenateWords("a","b"));
        assertThrows(NullPointerException.class,()->Utils.concatenateWords("a",null));
        assertThrows(NullPointerException.class,()->Utils.concatenateWords(null,"xdf"));
        assertTrue(Utils.concatenateWords("","").isEmpty());
        assertTrue(Utils.concatenateWords("iytfHJH","aergh").matches("[a-zA-Z]*"));
        assertFalse(Utils.concatenateWords("феряпв","aergh").matches("[a-zA-Z]*"));
    }

    @Test
    void testFactorialWithTimeout(){
        int num = (int) (Math.random()*200);
        assertTimeoutPreemptively(Duration.ofNanos(1000),()->Utils.computeFactorial(num));
        assertTimeoutPreemptively(Duration.ofMillis(10),()->Utils.computeFactorial(num));
    }
}