package et_framework.Abstract_Object_Patterns;

public abstract class Atom_Space {

  public Integer AtomSpaceID;

  private Integer Total_LTI;

  private Integer Total_STI;

  private Integer atomCount;

  private Integer atomIndex;

  private Atom AtomPTR;
    
  
  public abstract Integer get_LTI();

  public abstract void adjust_LTI(String op, Integer value);

  public abstract Integer get_STI();

  public abstract void adjust_STI(String op, Integer value);

  public abstract Atom setAtom();

  public abstract Atom getFirstAtom();

  public abstract Atom getNextAtom();

}