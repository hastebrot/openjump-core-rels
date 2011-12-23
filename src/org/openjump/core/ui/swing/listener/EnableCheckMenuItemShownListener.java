/* *****************************************************************************
 The Open Java Unified Mapping Platform (OpenJUMP) is an extensible, interactive
 GUI for visualizing and manipulating spatial features with geometry and
 attributes. 

 Copyright (C) 2007  Revolution Systems Inc.

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

 For more information see:
 
 http://openjump.org/

 ******************************************************************************/
package org.openjump.core.ui.swing.listener;

import javax.swing.JMenuItem;

import com.vividsolutions.jump.workbench.JUMPWorkbench;
import com.vividsolutions.jump.workbench.WorkbenchContext;
import com.vividsolutions.jump.workbench.plugin.EnableCheck;
import com.vividsolutions.jump.workbench.ui.WorkbenchFrame;
import com.vividsolutions.jump.workbench.ui.plugin.MenuItemShownListener;

public class EnableCheckMenuItemShownListener implements MenuItemShownListener {
  private EnableCheck enableCheck;

  private WorkbenchContext workbenchContext;

  private String enabledMessage;

  public EnableCheckMenuItemShownListener(WorkbenchContext workbenchContext,
    EnableCheck enableCheck) {
    this.workbenchContext = workbenchContext;
    this.enableCheck = enableCheck;
  }

  public EnableCheckMenuItemShownListener(WorkbenchContext workbenchContext,
    EnableCheck enableCheck, String enabledMessage) {
    this.workbenchContext = workbenchContext;
    this.enableCheck = enableCheck;
    this.enabledMessage = enabledMessage;
  }

  public void menuItemShown(JMenuItem menuItem) {
    String errorMessage = null;
    try {
      errorMessage = enableCheck.check(menuItem);
    } catch (Exception e) {
      JUMPWorkbench workbench = workbenchContext.getWorkbench();
      WorkbenchFrame frame = workbench.getFrame();
      frame.log(menuItem.getText());
      frame.handleThrowable(e);
    }
    if (errorMessage != null) {
      menuItem.setEnabled(false);
      menuItem.setToolTipText(errorMessage);
    } else {
      menuItem.setEnabled(true);
      menuItem.setToolTipText(enabledMessage);
    }
  }
}
