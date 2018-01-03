package et_framework.Abstract_Object_Patterns;

public abstract class Cognitive_Task {

  public Integer CogTaskID;

  public String CogTaskName;

  public Integer ProcCount;

  private Integer ProcIndex;

  public java.util.Vector CogProcTable;

 

  public abstract void doCognitiveTask(Integer asID);

}