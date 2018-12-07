package befaster.solutions.HLO;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloSolutionTest {

    HelloSolution helloSolution;

    @Before
    public void setup(){
        helloSolution = new HelloSolution();
    }

    @Test
    public void hello() {
        Assert.assertEquals("Hello, World!",helloSolution.hello("Ravi"));
    }
}