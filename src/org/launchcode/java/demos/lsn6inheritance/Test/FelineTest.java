package org.launchcode.java.demos.lsn6inheritance.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.*;

public class FelineTest {
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("KB Cat");
        assertEquals(13, keyboardCat.getWeight(), .001);
    }

    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("KB Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        keyboardCat.eat();
        assertTrue(keyboardCat.isTired());
    }
}
