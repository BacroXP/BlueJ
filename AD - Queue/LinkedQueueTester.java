import org.junit.Before;

/**
 * Testklasse für die LinkedQueue
 * 
 * @author Rainer Helfrich
 * @version Oktober 2020
 */
public class LinkedQueueTester extends QueueTester
{
    @Before
    public void setUp()
    {
        theQueue = new LinkedQueue<Integer>();
    }
}