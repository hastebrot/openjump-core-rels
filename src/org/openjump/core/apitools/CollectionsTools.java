/*
 * Created on 13.04.2005 for PIROL
 *
 * SVN header information:
 *  $Author: michaudm $
 *  $Rev: 1670 $
 *  $Date: 2009-02-25 00:33:13 +0100 (Mi, 25. Feb 2009) $
 *  $Id: CollectionsTools.java 1670 2009-02-24 23:33:13Z michaudm $
 */
package org.openjump.core.apitools;

import java.util.List;

/**
 * Class for more convenient use of Lists and Arrays.
 * 
 * @author Ole Rahn
 * 
 * FH Osnabr&uuml;ck - University of Applied Sciences Osnabr&uuml;ck
 * Project PIROL 2005
 * Daten- und Wissensmanagement
 * 
 */
public class CollectionsTools extends ToolToMakeYourLifeEasier {

    public static boolean addArrayToList( List toAddTo, Object[] arrayToBeAdded ){
        
        for ( int i=0; i<arrayToBeAdded.length; i++ ){
            toAddTo.add(arrayToBeAdded[i]);
        }
        
        return true;
    }

}
