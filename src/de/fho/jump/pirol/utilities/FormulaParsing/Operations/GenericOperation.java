/*
 * Created on 23.06.2005 for PIROL
 *
 * SVN header information:
 *  $Author: javamap $
 *  $Rev: 856 $
 *  $Date: 2007-06-19 06:15:27 +0200 (Di, 19. Jun 2007) $
 *  $Id: GenericOperation.java 856 2007-06-19 04:15:27Z javamap $
 */
package de.fho.jump.pirol.utilities.FormulaParsing.Operations;

import de.fho.jump.pirol.utilities.FormulaParsing.FormulaValue;

/**
 * Base class for mathmatic operations like division, addition, etc.
 *
 * @author Ole Rahn
 * <br>
 * <br>FH Osnabr&uuml;ck - University of Applied Sciences Osnabr&uuml;ck,
 * <br>Project: PIROL (2005),
 * <br>Subproject: Daten- und Wissensmanagement
 * 
 * @version $Rev: 856 $
 * 
 */
public abstract class GenericOperation extends FormulaValue {
    
    protected FormulaValue value1=null, value2=null;
    protected String opString = "#";

    /**
     * Sets the value, that will be operated on.
     *@param value1
     *@param value2
     */
    public GenericOperation(FormulaValue value1, FormulaValue value2) {
        super();
        this.value1 = value1;
        this.value2 = value2;
    }
    
    /**
     * @inheritDoc
     */
    public boolean isFeatureDependent() {
        return this.value1.isFeatureDependent() || this.value2.isFeatureDependent();
    }
    
    /**
     * @inheritDoc
     */
    public String toString(){
        return "(" + this.value1.toString() + ") " + this.opString + " ("+this.value2+")";
    }
    

}
