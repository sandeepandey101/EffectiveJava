import com.org.jdevexperts.effectivejava.PhoneNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * // TODO Comment
 */
public class PhoneNumberTest {

  @Test
  public void testReflixNature() {
    PhoneNumber of = PhoneNumber.of(123, 2345);
    Assert.assertEquals(of,of);
  }
}
