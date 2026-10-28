package edu.epn.fislab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void starterProjectRuns() {
        assertEquals("FIS-Lab", App.productName());
    }
}
