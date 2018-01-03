package et_framework.Abstract_Object_Patterns;

public abstract class Truth_Value {

  private Integer Probability;

  private Integer WeightOfEvidence;

  public TV_Fuzzy_Set FuzzySet;

 
  public abstract void setProbability(String op, Integer value);

  public abstract void setWeightOfEvidence(String op, Integer value);

  public abstract Integer getTruthValue();

}