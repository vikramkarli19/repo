package testRunners;

import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void testAddition() {
        int result = 2 + 3;
        assert result == 5 : "Addition failed!";
    }

}
