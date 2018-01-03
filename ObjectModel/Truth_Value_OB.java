/*
 * EMULATOR-TRANSLATOR FRAMEWORK
 * Object Model - Truth_Value
 */
package et_framework.ObjectModel;

import et_framework.Abstract_Object_Patterns.Truth_Value;

/**
 *
 * @author Daniel Martin
 */
public class Truth_Value_OB extends Truth_Value{

    @Override
    public void setProbability(String op, Integer value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setWeightOfEvidence(String op, Integer value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getTruthValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
