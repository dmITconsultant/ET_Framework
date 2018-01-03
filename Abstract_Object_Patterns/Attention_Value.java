package et_framework.Abstract_Object_Patterns;

public abstract class Attention_Value {

  private Integer LT_Importance;

  private Integer ST_Importance;

  public AV_Fuzzy_Set FuzzySet;


  public abstract void setLT_Importance(String op, Integer value);

  public abstract void setST_Importance(String op, Integer value);

  public abstract Integer getAttentionValue();

}