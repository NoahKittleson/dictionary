import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Dictionary");
  }

  @Test
  public void addWordToHomepage() {
    goTo("http://localhost:4567/");
    fill("#word").with("Ragamuffin");
    submit(".btn");
    assertThat(pageSource()).contains("Ragamuffin");
  }

  @Test
  public void newWordsActAsLinksToTheirOwnPages() {
    Word.clear();
    goTo("http://localhost:4567/");
    fill("#word").with("test");
    submit(".btn");
    click("a", withText("test"));
    assertThat(pageSource()).contains("test");
  }

  @Test
  public void submittingADefinitionForAWord() {
    goTo("http://localhost:4567/");
    fill("#word").with("rag");
    submit(".btn");
    click("a", withText("rag"));
    fill("#definition").with("a piece of cloth");
    submit(".btn");
    assertThat(pageSource()).contains("a piece of cloth");
  }
}
