package TestMethod;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author Sanyukta 
 * test method created for testing
 *
 */

public class MoodTest {
	@Test
	public void getmoodByPassingMsg() {
		MoodAnaylizer mood = new MoodAnaylizer();
		Assert.assertNotEquals("SAD", mood.getMood("I am in any mood"));

	}

}
