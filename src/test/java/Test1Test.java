import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;

public class Test1Test {

//    @Parameterized.Parameters
//    public static Collection<Object[]> data() {
//        Arrays.asList();
//    }



    @Test
    public void main() {
        Test1 fizzBuzz = new Test1();
        //Assert.assertThat(fizzBuzz.of(3),is("Fizz"));
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz ");
       //ssertThat(result).isEqualTo(excepted);

    }
}
