import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void createWord_instantiatesWordCorrectly_true() {
    Word testWord = new Word("Ragamuffin");
    assertTrue(testWord instanceof Word);
  }

  @Test
  public void createWord_createWordAndAccessName_String() {
    Word testWord = new Word("Ragamuffin");
    assertEquals("Ragamuffin", testWord.getName());
  }
}
