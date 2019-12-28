import static org.fest.assertions.api.Assertions.assertThat;
import javafx.beans.binding.BooleanExpression;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class FizzBuzzTest {

    @Test
    public void ThreetoFizz(){
        int num =3;
        String result =  FizzBuzz.of(num);
        assertThat(result).isEqualTo("Fizz");
    }



}
