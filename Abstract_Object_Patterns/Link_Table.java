package et_framework.Abstract_Object_Patterns;

public abstract class Link_Table {

  private Integer TB_Count;

  private Integer TB_Index;

  private Atom atomPTR;

  
  public abstract Atom getFirst();

  public abstract Atom getNext();

  public abstract void addLink(Atom atomPTR);

}