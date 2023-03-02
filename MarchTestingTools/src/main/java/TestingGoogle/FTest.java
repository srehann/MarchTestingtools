package TestingGoogle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FTest extends Base {
@Test
public void failTestGoogle() {
	String wrongTitle=driver.getTitle();
	Assert.assertEquals(wrongTitle, null);
}
}
