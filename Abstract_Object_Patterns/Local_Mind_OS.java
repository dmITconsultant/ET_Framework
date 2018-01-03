package et_framework.Abstract_Object_Patterns;

public abstract class Local_Mind_OS {

  private Integer LMindID;

  public Atom_Space ForeBrain;

  public Atom_Space Mid_Brain;

  public Atom_Space HindBrain;

  public java.util.Vector aMindAgent;

  public Map_Table aMapTable;


  public abstract void run();

}