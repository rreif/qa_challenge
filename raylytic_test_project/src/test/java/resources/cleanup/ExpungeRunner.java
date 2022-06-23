package resources.cleanup;

import com.intuit.karate.junit5.Karate;

public class ExpungeRunner {
    @Karate.Test
    Karate testUsers() {
        return Karate.run("expunge").relativeTo(getClass());
    }
}
