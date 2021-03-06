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

package com.netscape.management.client.ug;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import com.netscape.management.nmclf.*;
import com.netscape.management.client.util.RemoteImage;
import javax.swing.*;


/**
 * ResEditorOUTitlePage is used when editing an organizational unit entry.
 * This panel occupies the top portion of the ResourceEditor.
 *
 * @see ResourceEditor
 */
public class ResEditorOUTitlePage extends JPanel implements Observer {
    JLabel _ouName;
    JLabel imageLabel;

    /**
    * Constructor
    *
    * @param observable  the observable object
    */
    public ResEditorOUTitlePage(ResourcePageObservable observable) {
        super(true);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(layout);

        _ouName = new SuiTitle("");
        _ouName.setText(observable.get("ou", 0));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(0, SuiLookAndFeel.COMPONENT_SPACE, 0,
                SuiLookAndFeel.COMPONENT_SPACE);
        c.anchor = GridBagConstraints.NORTHWEST;
        c.weightx = 1;
        c.weighty = 0;
        layout.setConstraints(_ouName, c);
        add(_ouName);

        RemoteImage imageIcon = new RemoteImage("com/netscape/management/nmclf/icons/ou24.gif");
        imageLabel = new JLabel(imageIcon);
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.weightx = 0;
        c.insets = new Insets(SuiLookAndFeel.COMPONENT_SPACE,
                SuiLookAndFeel.COMPONENT_SPACE,
                SuiLookAndFeel.COMPONENT_SPACE,
                SuiLookAndFeel.COMPONENT_SPACE);
        c.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(imageLabel, c);
        add(imageLabel);
    }

    /**
     * Sets the name of the organizational unit.
     *
     * @param name  the name of the organizational unit
     */
    public void setName(String name) {
        _ouName.setText(name);
    }

    /**
     * Implements the Observer interface. Updates the information in
     * this pane when called.
     *
     * @param o    the observable object
     * @param arg  argument
     */
    public void update(Observable o, Object arg) {
        ResourcePageObservable observable = (ResourcePageObservable) o;

        _ouName.setText(observable.get("ou", 0));
    }
}
