import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void main() {
    }

    @Disabled
    @Test
    void testComputeFactorial() {
        assertEquals(120,Utils.computeFactorial(-5));
    }

    @Test
    void testConcatenateWords() {
        assertNotNull(Utils.concatenateWords("3","sxth"));
        assertTrue(Utils.concatenateWords("","").isEmpty());
        assertTrue(Utils.concatenateWords("iytfHJH","aergh").matches("[a-zA-Z]*"));
    }

    @Test
    void testFactorialWithTimeout(){
        int num = (int) (Math.random()*200);
        assertTimeoutPreemptively(Duration.ofNanos(1000),()->Utils.computeFactorial(num));
    }
}