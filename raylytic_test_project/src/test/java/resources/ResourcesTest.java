package resources;

        import com.intuit.karate.Results;
        import com.intuit.karate.Runner;
        import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;

class ResourcesTest {

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:resources")
                //.outputCucumberJson(true)
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
