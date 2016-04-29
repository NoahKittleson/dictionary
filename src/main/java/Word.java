import java.util.ArrayList;

public class Word {
  private String mName;
  private ArrayList<Definition> mDefinitions;

  public Word(String name) {
    mName = name;
    mDefinitions = new ArrayList<Definition>();
  }

  public String getName() {
    return mName;
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

  public ArrayList<Definition> getDefinitions() {
    return mDefinitions;
  }
}
