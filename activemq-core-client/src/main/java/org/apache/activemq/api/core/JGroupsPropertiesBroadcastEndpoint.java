/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.api.core;

import org.jgroups.JChannel;
import org.jgroups.conf.PlainConfigurator;

/**
 * This class is the implementation of ActiveMQ members discovery that will use JGroups.
 *
 * @author Howard Gao
 */
public final class JGroupsPropertiesBroadcastEndpoint extends JGroupsBroadcastEndpoint
{
   private String properties;

   public JGroupsPropertiesBroadcastEndpoint(final String properties, final String channelName) throws Exception
   {
      super(channelName);
      this.properties = properties;
   }

   @Override
   public JChannel createChannel() throws Exception
   {
      PlainConfigurator configurator = new PlainConfigurator(properties);
      return new JChannel(configurator);
   }
}
