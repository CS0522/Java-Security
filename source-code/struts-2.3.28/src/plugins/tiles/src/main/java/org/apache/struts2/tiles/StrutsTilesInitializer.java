/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.struts2.tiles;

import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import org.apache.tiles.TilesApplicationContext;
import org.apache.tiles.factory.AbstractTilesContainerFactory;
import org.apache.tiles.startup.AbstractTilesInitializer;

import javax.servlet.ServletContext;

public class StrutsTilesInitializer extends AbstractTilesInitializer {

    private static final Logger LOG = LoggerFactory.getLogger(StrutsTilesInitializer.class);

    @Override
    protected TilesApplicationContext createTilesApplicationContext(TilesApplicationContext preliminaryContext) {
        LOG.debug("Initializing Tiles wildcard support ...");
        return new StrutsWildcardServletTilesApplicationContext((ServletContext) preliminaryContext.getContext());
    }

    @Override
    protected AbstractTilesContainerFactory createContainerFactory(TilesApplicationContext context) {
        LOG.trace("Creating dedicated Struts factory to create Tiles container");
        return new StrutsTilesContainerFactory();
    }

}
