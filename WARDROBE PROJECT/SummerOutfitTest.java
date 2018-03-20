

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SummerOutfitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SummerOutfitTest
{
    private SummerOutfit summerOu1;

    /**
     * Default constructor for test class SummerOutfitTest
     */
    public SummerOutfitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        summerOu1 = new SummerOutfit("shirt", "pants", "shoes", "hat");
        summerOu1.clearOutfits();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
