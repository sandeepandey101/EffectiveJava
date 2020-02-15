import com.org.jdevexperts.effectivejava.Operation;
import org.junit.Assert;
import org.junit.Test;

/**
 * // TODO Comment
 */
public class TestOperation {

  @Test
  public void testAddOperation() {
    int addResult = Operation.ADD.apply(4, 5);
    Assert.assertEquals(addResult,9);
  }

  @Test
  public void testMultiply() {
    int mResult = Operation.MULTIPLY.apply(4,5);
    Assert.assertEquals(mResult,20);
  }
}
