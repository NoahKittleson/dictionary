import java.util.ArrayList;

public class Word {
  private String mName;
  private ArrayList<Definition> mDefinitions;
  private static ArrayList<Word> mInstances = new ArrayList<Word>();
  private int mId;

  public Word(String name) {
    mName = name;
    mDefinitions = new ArrayList<Definition>();
    mInstances.add(this);
    mId = mInstances.size();
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

  public int getId() {
    return mId;
  }

  public static Word find (int id) {
    try {
      return mInstances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
