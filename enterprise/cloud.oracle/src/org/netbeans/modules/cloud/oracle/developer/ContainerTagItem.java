/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.cloud.oracle.developer;

import org.netbeans.modules.cloud.oracle.items.OCID;
import org.netbeans.modules.cloud.oracle.items.OCIItem;

/**
 *
 * @author Jan Horvath
 */
public final class ContainerTagItem extends OCIItem {
    
    private String digest;
    private String version;
    private String regionCode;
    private String namespace;
    private String repositoryName;

    public ContainerTagItem(OCID id, String compartmentId, String repositoryName, String regionCode, String namespace, String version, String digest) {
        super(id, compartmentId, version != null ? version : digest);
        this.regionCode = regionCode;
        this.version = version;
        this.digest = digest;
        this.repositoryName = repositoryName;
        this.namespace = namespace;
    }

    public ContainerTagItem() {
        super();
    }

    public String getUrl() {
        if (version != null) {
            return String.format("%s.ocir.io/%s/%s:%s", regionCode, namespace, repositoryName, version);
        } 
        return String.format("%s.ocir.io/%s/%s@%s", regionCode, namespace, repositoryName, digest);
    }

    public String getDigest() {
        return digest;
    }

    public String getVersion() {
        if (version == null) {
            return "";
        }
        return version;
    }
    
}
