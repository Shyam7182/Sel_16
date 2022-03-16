import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void CheckInside() {
		Assert.assertEquals(false, false);
	}
	@Test
	public void CheckOutside(){
		Assert.assertEquals(false, true);
	}
}


