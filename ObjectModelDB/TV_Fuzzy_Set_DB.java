/*
 * EMULATOR-TRANSLATOR FRAMEWORK
 * Database Model - TV_Fuzzy_Set
 */
package et_framework.ObjectModelDB;

import et_framework.Abstract_Object_Patterns.TV_Fuzzy_Set;

/**
 *
 * @author Daniel Martin
 */
public class TV_Fuzzy_Set_DB extends TV_Fuzzy_Set{

    @Override
    public Boolean LikelyTrue(Integer prob, Integer woe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean LikelyFalse(Integer prob, Integer woe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean VeryLikely(Integer prob, Integer woe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
