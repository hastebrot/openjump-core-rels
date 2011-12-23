/*
 * Created on 02.08.2005 for PIROL
 *
 * SVN header information:
 *  $Author: mentaer $
 *  $Rev: 1245 $
 *  $Date: 2007-11-22 10:35:11 +0100 (Do, 22. Nov 2007) $
 *  $Id: PirolPlugInMessages.java 1245 2007-11-22 09:35:11Z mentaer $
 */
package de.fho.jump.pirol.utilities.i18n;

import java.util.MissingResourceException;

import org.openjump.core.apitools.HandlerToMakeYourLifeEasier;

import de.fho.jump.pirol.utilities.debugOutput.DebugUserIds;
import de.fho.jump.pirol.utilities.debugOutput.PersonalLogger;


/**
 * Handles i18n stuff for PIROL plugIns.<br>
 * Class that Eclipse generates, if the "Externalize Strings" command is used. Was renamed (from <code>Messages.java</code>) and modified to use the openJump i18n plug - the interface stayed the same!<br>
 * Wrapper for the i18N to make work with PIROL labels easier.
 *
 * @author Ole Rahn
 * <br>
 * <br>FH Osnabr&uuml;ck - University of Applied Sciences Osnabr&uuml;ck,
 * <br>Project: PIROL (2005),
 * <br>Subproject: Daten- und Wissensmanagement
 * 
 * @version $Rev: 1245 $
 * 
 */
public class PirolPlugInMessages implements HandlerToMakeYourLifeEasier {
    private static final String BUNDLE_NAME = "de.fhOsnabrueck.jump.pirol.resources.PirolPlugIns";
    
    private static boolean inited = false;

    protected static PersonalLogger logger = new PersonalLogger(DebugUserIds.ALL);
    /**
     * We don't need instances of the class!
     */
    private PirolPlugInMessages(){}

    /**
     * Get a translated PIROL text from the i18N system.
     *@param key the key (name) for the the text 
     *@return the translated text
     */
    public static String getString(String key) {
        if (!PirolPlugInMessages.inited){
            I18NPlug.setPlugInRessource("de.fhOsnabrueck.jump.pirol", PirolPlugInMessages.BUNDLE_NAME);
            PirolPlugInMessages.inited = true;
        }
        
        try {
            return I18NPlug.get("de.fhOsnabrueck.jump.pirol", key);
        } catch (MissingResourceException e) {
            logger.printMinorError("i18n key not found for: \"" + key + "\"");
            return "!" + key + "!";
        }
    }

    public static boolean isInited() {
        return inited;
    }
    
}
