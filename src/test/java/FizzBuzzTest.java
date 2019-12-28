import org.fest.assertions.core.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void test(){
        int number = 1;
        assertEquals("1", FizzBuzz.of(number));
    }
}
