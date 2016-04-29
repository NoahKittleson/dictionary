import java.util.ArrayList;

public class Word {
  private String mName;
  private ArrayList<Definition> mDefinitions;
  private static ArrayList<Word> mInstances = new ArrayList<Word>();

  public Word(String name) {
    mName = name;
    mDefinitions = new ArrayList<Definition>();
    mInstances.add(this);
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

  public static ArrayList<Word> getAll() {
    return mInstances;
  }
}
