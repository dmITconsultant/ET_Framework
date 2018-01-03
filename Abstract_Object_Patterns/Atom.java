package et_framework.Abstract_Object_Patterns;

/*
 * 
 */
public abstract class Atom {

  public Integer AtomID;

  public Integer AtomSpaceID;

  public Integer AtomTypeCode;

  public Integer AtomSubTypeCode;

  public Boolean isNode;

  public Boolean isLink;

  public Boolean isMap;

  public Truth_Value aTruthValue;

  public Attention_Value aAttentionValue;

  public Link_Table aIN_LinkTable;

  public Link_Table aOUT_LinkTable;

  public Ordinal_Value aOrdinalValue;

  public String AtomData;

}