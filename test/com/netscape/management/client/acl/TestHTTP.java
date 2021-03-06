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
package com.netscape.management.client.acl;

import java.net.URL;

public class TestHTTP {
    public static void main(String args[]) throws Exception {
        HttpACL hacl = new HttpACL();

        hacl.retrieveACL(new URL("http://skydome/read.cgi?file=tmp/testacl"));

        System.out.println(hacl);

        hacl.getRule(0).setAttribute("dns", "newhost1");

        System.out.println(hacl);

        hacl.updateACL(new URL("http://skydome/put.cgi?file=tmp/testacl"));

        System.exit(0);
    }
}
