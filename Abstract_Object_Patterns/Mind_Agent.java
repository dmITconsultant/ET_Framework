package et_framework.Abstract_Object_Patterns;

public abstract class Mind_Agent {

  public Integer AgentID;

  public Integer[] AtomSpaceID;

  public Integer TaskCount;

  private Integer TaskIndex;

  public java.util.Vector CogTaskTable;

  
  public abstract void run();

}