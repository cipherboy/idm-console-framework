/** BEGIN COPYRIGHT BLOCK
 * Copyright (C) 2001 Sun Microsystems, Inc.  Used by permission.
 * Copyright (C) 2005 Red Hat, Inc.
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version
 * 2.1 of the License.
 *                                                                                 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *                                                                                 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * END COPYRIGHT BLOCK **/
package com.netscape.management.client;

/**
  * Defines a toggle menu item.
  * Selecting it toggles its checked state.
  */
public interface IMenuItemCheckBox extends IMenuItem {
    /**
       * Registers the text to display on the menu item.
       * This string should be internationalized and
       * may contain a keyboard shortcut if applicable.
       * It is defined by using an ampersand (&) character.
       * For example, "&View" defines alt-V as the
       * shortcut keystroke.
       *
       * @return the string to display.
       */
    public abstract String getText();

    /**
      * Defines the text to display on the status bar as
      * the cursor hovers over this menu item.
      *
      * @return the string to display
      */
    public abstract String getDescription();

    /**
      * Defines the state of the menu item.  If state is true,
      * then the check mark is displayed, otherwise the
      * check mark is not displayed.
      *
      * @return true or false indicating current state
      */
    public abstract boolean isChecked();
}
