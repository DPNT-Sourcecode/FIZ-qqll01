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


    /**
     * It is time to completely change the "deluxe" concept such that:
     *   - The old rules for "deluxe" do not apply.
     *   - A number is "deluxe" if it fulfils at least one of the following:
     *        - is divisible by 3 AND contains a 3
     *        - is divisible by 5 AND contains a 5
     *   - We should still say "fake deluxe" if the "deluxe" number is odd
     *   - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
     *   - All the previous rules for "fizz" and "buzz" are still valid
     */

}
