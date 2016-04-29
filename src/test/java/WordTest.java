import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  @After
  public void tearDown() {
    Word.clear();
  }

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

  @Test
  public void createWord_addAndAccessDefinitionOfWord_true() {
    Word testWord = new Word("Ragamuffin");
    Definition testDefinition = new Definition("a person, typically a child, in ragged, dirty clothes");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }

  @Test
  public void createWord_AccessAllWords_true() {
    Word testWord = new Word("Ragamuffin");
    Word secondWord = new Word("Rapscallion");
    assertTrue(Word.getAll().contains(testWord));
    assertTrue(Word.getAll().contains(secondWord));
  }

  @Test
  public void createWord_AccessSpecificWordByID_Word() {
    Word testWord = new Word("Ragamuffin");
    Word secondWord = new Word("Rapscallion");
    assertEquals(secondWord, Word.find(secondWord.getId()));
  }
}
