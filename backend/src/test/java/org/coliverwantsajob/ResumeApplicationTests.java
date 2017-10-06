package org.coliverwantsajob;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ResumeApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(ResumeApplicationTests.class);

    @Test
    public void GenericTest() throws Exception {
        log.info("Test run successfully.");
    }
}
