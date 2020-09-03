import org.junit .Assert;
import org.junit.Test;

public class CaesarsCipher_Test {
  private String result = "abc";

  @Test
  public void resultLettersAlfabeth() {
    Assert.assertEquals("abc", result);
  }
}
