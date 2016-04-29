import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void createWord_instantiatesWordCorrectly_true() {
    Definition testDefinition = new Definition("a person, typically a child, in ragged, dirty clothes");
    assertTrue(testDefinition instanceof Definition);
  }

  @Test
  public void createDefinition_createDefinitionAndAccessName_String() {
    Definition testDefinition = new Definition("a person, typically a child, in ragged, dirty clothes");
    assertEquals("a person, typically a child, in ragged, dirty clothes", testDefinition.getText());
  }
}
