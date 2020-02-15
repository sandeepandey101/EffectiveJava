import com.org.jdevexperts.effectivejava.MethodReferences;
import org.junit.Test;

import java.time.Instant;
import java.util.function.Predicate;

/**
 * // TODO Comment
 */
public class MethodReferencesTest {

  @Test
  public void testFunctionMethodReference() {
    MethodReferences.st(Integer::parseInt);
    MethodReferences.bound(Instant.now()::isAfter);

  }
}
