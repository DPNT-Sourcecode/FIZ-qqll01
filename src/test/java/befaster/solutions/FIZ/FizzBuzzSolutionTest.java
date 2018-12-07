package befaster.solutions.FIZ;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {

    FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setup(){
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    /*
    * Fizz Pass Test
    * */
    @Test
    public void fizz_success_test() {
        assertThat(fizzBuzzSolution.fizzBuzz(6),equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(13),equalTo("fizz"));
    }

    /*
     * Buzz Pass Test
     * */
    @Test
    public void buzz_success_test() {
        assertThat(fizzBuzzSolution.fizzBuzz(10),equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(151),equalTo("buzz"));
    }


    @Test
    public void fizzbuzz_success_test() {
        assertThat(fizzBuzzSolution.fizzBuzz(15),equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(53),equalTo("fizz buzz"));
    }

    @Test
    public void non_fizzbuzz_success_test() {
        assertThat(fizzBuzzSolution.fizzBuzz(1),equalTo("1"));
    }

    @Test
    public void deluxe_success_test() {
        assertThat(fizzBuzzSolution.fizzBuzz(22),equalTo("deluxe"));
    }

    @Test
    public void fake_deluxe_success_test() {
        assertThat(fizzBuzzSolution.fizzBuzz(11),equalTo("fake deluxe"));
    }


    /*
    *
    *  - {"method":"fizz_buzz","params":[33],"id":"FIZ_R3_037"}, expected: "fizz deluxe", got: "fizz  deluxe"
 - {"method":"fizz_buzz","params":[222],"id":"FIZ_R3_038"}, expected: "fizz deluxe", got: "fizz  deluxe"
 - {"method":"fizz_buzz","params":[777],"id":"FIZ_R3_039"}, expected: "fizz deluxe", got: "fizz  deluxe"
    * */
}
