/*
 * Created on 29.06.2005 for PIROL
 *
 * SVN header information:
 *  $Author: javamap $
 *  $Rev: 856 $
 *  $Date: 2007-06-19 06:15:27 +0200 (Di, 19. Jun 2007) $
 *  $Id: SquareRootOperation.java 856 2007-06-19 04:15:27Z javamap $
 */
package de.fho.jump.pirol.utilities.FormulaParsing.Operations;

import com.vividsolutions.jump.feature.Feature;

import de.fho.jump.pirol.utilities.FormulaParsing.FormulaValue;

/**
 * Class that represents a square root operation on the given value.
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
public class SquareRootOperation extends FormulaValue {
    
    protected FormulaValue value = null;

    public SquareRootOperation(FormulaValue value) {
        super();
        this.value = value;
    }
    /**
     *@param feature
     *@return the square root of the given value
     */
    public double getValue(Feature feature) {
        return Math.sqrt(this.value.getValue(feature));
    }

    /**
     *@inheritDoc
     */
    public boolean isFeatureDependent() {
        return this.value.isFeatureDependent();
    }
    
    /**
     *@inheritDoc
     */
    public String toString() {
        return "Math.sqrt("+ this.value.toString() +")";
    }

}
