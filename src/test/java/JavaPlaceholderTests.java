import static org.junit.Assert.*;

import org.junit.Test;


public class JavaPlaceholderTests {

	@Test
	public void firstTest() {
	    JavaPlaceholder placeholder = new JavaPlaceholder();
	    assertTrue(placeholder.isTruthy());
	}


}
