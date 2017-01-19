//
//  ========================================================================
//  Copyright (c) 1995-2017 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.nosql.mongodb;

import org.eclipse.jetty.server.session.AbstractLocalSessionScavengingTest;
import org.eclipse.jetty.server.session.AbstractTestServer;

public class LocalSessionScavengingTest extends AbstractLocalSessionScavengingTest
{

    @Override
    public AbstractTestServer createServer(int port, int max, int scavenge)
    {
       MongoTestServer mserver=new MongoTestServer(port,max,scavenge);
       ((MongoSessionIdManager)mserver.getServer().getSessionIdManager()).setScavengeBlockSize(0);
       return mserver;
    }

    @Override
    public void testLocalSessionsScavenging() throws Exception
    {
        super.testLocalSessionsScavenging();
    }
    
    

}
