import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;
@RunWith(Parameterized.class)
public class FizzBuzzTest {
    private String excepted;
    private int number;

    public FizzBuzzTest(String excepted, int number) {
        this.excepted = excepted;
        this.number = number;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
         return Arrays.asList(new Object[][]{
                 {"1",1},
                 {"Fizz",3},
                 {"Buzz",5},
                 {"FizzBuzz",15}
         });
    }

    @Test
    public void test(){

        assertEquals(excepted, FizzBuzz.of(number));
    }
}
