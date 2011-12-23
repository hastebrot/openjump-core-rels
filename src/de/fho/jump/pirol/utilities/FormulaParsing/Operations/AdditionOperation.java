/*
 * Created on 23.06.2005 for PIROL
 *
 * SVN header information:
 *  $Author: michaudm $
 *  $Rev: 1559 $
 *  $Date: 2008-10-06 00:54:14 +0200 (Mo, 06. Okt 2008) $
 *  $Id: AdditionOperation.java 1559 2008-10-05 22:54:14Z michaudm $
 */
package de.fho.jump.pirol.utilities.FormulaParsing.Operations;

import com.vividsolutions.jump.feature.Feature;

import de.fho.jump.pirol.utilities.FormulaParsing.FormulaValue;

/**
 * Class to handle additions within a formula.
 *
 * @author Ole Rahn
 * <br>
 * <br>FH Osnabr&uuml;ck - University of Applied Sciences Osnabr&uuml;ck,
 * <br>Project: PIROL (2005),
 * <br>Subproject: Daten- und Wissensmanagement
 * 
 * @version $Rev: 1559 $
 * 
 */
public class AdditionOperation extends GenericOperation {

    /**
     * Sets the value, that will be operated on.
     */
    public AdditionOperation(FormulaValue value1, FormulaValue value2) {
        super(value1, value2);
        this.opString = "+";
    }

    /**
     * Returns the summarized values of the sub-values or sub-operations of this operation
     *@param feature
     *@return summarized values of the sub-values or sub-operations
     */
    public double getValue(Feature feature) {
        return this.value1.getValue(feature) + this.value2.getValue(feature);
    }

}
