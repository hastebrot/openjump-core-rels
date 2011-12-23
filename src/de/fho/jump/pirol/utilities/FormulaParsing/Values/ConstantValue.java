/*
 * Created on 23.06.2005 for PIROL
 *
 * SVN header information:
 *  $Author: javamap $
 *  $Rev: 856 $
 *  $Date: 2007-06-19 06:15:27 +0200 (Di, 19. Jun 2007) $
 *  $Id: ConstantValue.java 856 2007-06-19 04:15:27Z javamap $
 */
package de.fho.jump.pirol.utilities.FormulaParsing.Values;

import com.vividsolutions.jump.feature.Feature;

import de.fho.jump.pirol.utilities.FormulaParsing.FormulaValue;

/**
 * A simple value class that just stores a constant value.
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
public class ConstantValue extends FormulaValue {
    
    protected double value;

    public ConstantValue(double value) {
        super();
        this.value = value;
    }
    
    /**
     *@param feature in this case we don't need the feature...
     *@return the constant value
     */
    public double getValue(Feature feature) {
        return this.value;
    }
    
    /**
     * @inheritDoc
     */
    public boolean isFeatureDependent() {
        return false;
    }
    
    /**
     * @inheritDoc
     */
    public String toString(){
        return "" + this.value;
    }

}
