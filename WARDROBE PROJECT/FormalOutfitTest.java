

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FormalOutfitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FormalOutfitTest
{
    private FormalOutfit formalOu1;

    /**
     * Default constructor for test class FormalOutfitTest
     */
    public FormalOutfitTest()
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
        formalOu1 = new FormalOutfit("shirt", "pants", "shoes", "suit", "tie");
        formalOu1.clearOutfits();
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
