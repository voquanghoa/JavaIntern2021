import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {

    @Test
    public void test_ucln(){
        Exercise01 exercise01 = new Exercise01();

        assertEquals(exercise01.ucln(2, 8), 2);
    }
}
