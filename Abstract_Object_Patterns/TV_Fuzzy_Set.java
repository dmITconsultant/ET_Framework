package et_framework.Abstract_Object_Patterns;

public abstract class TV_Fuzzy_Set {

  public Integer HI_Probability;

  public Integer LO_Probability;

  public Integer HI_WeightOE;

  public Integer LO_WeightOE;

 
  public abstract Boolean LikelyTrue(Integer prob, Integer woe);

  public abstract Boolean LikelyFalse(Integer prob, Integer woe);

  public abstract Boolean VeryLikely(Integer prob, Integer woe);

}