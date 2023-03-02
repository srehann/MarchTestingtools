package TestingGoogle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PTest extends Base {
	@Test
	public void passTestGoogle() {
		String rightTitle=driver.getTitle();
		Assert.assertEquals(rightTitle, "Google");
	}
}