/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.plugin.task.datasource.oracle;

import org.apache.dolphinscheduler.plugin.task.datasource.BaseConnectionParam;
import org.apache.dolphinscheduler.spi.enums.DbConnectType;

public class OracleConnectionParam extends BaseConnectionParam {

    protected DbConnectType connectType;

    public DbConnectType getConnectType() {
        return connectType;
    }

    public void setConnectType(DbConnectType connectType) {
        this.connectType = connectType;
    }

    @Override
    public String toString() {
        return "OracleConnectionParam{"
                + "user='" + user + '\''
                + ", password='" + password + '\''
                + ", address='" + address + '\''
                + ", database='" + database + '\''
                + ", jdbcUrl='" + jdbcUrl + '\''
                + ", other='" + other + '\''
                + ", connectType=" + connectType
                + '}';
    }
}
