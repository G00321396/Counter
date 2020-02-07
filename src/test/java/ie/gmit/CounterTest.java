package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CounterTest {

    Counter myCounter;

    @Test
    void testConstructor()
    {
        myCounter = new Counter();
        assertEquals(0, myCounter.getCount());
    }

    @Test
    void testIncrement()
    {
        //int count = 0;
        myCounter = new Counter();
        assertEquals(1, myCounter.getCount());
    }

    @Test
    void testDecrement()
    {
        //int count = 0;
        myCounter=new Counter();
        assertEquals(-1, myCounter.getCount());
    }

    @Test
    void testConstuctorWithValue()
    {
        myCounter=new Counter();
        assertEquals(5, myCounter.getCount());
    }

}
