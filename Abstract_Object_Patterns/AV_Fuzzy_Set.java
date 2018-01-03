package et_framework.Abstract_Object_Patterns;

public abstract class AV_Fuzzy_Set {

  public Integer HI_STI;

  public Integer LO_STI;

  public Integer HI_LTI;

  public Integer LO_LTI;

  public abstract Boolean Remember(Integer LTI, Integer STI);

  public abstract Boolean Use(Integer LTI, Integer STI);

}