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
package org.netbeans.lib.chrome_devtools_protocol.debugger;

import java.util.Objects;

/**
 * Continues execution until specific location is reached.
 */
public final class ContinueToLocationRequest {
    private Location location;
    private String targetCallFrames;

    public ContinueToLocationRequest() {
    }

    /**
     * Location to continue to.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Location to continue to.
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Allowed Values: {@code any, current}
     */
    public String getTargetCallFrames() {
        return targetCallFrames;
    }

    /**
     * Allowed Values: {@code any, current}
     */
    public void setTargetCallFrames(String targetCallFrames) {
        this.targetCallFrames = targetCallFrames;
    }

    @Override
    public String toString() {
        return "ContinueToLocationRequest{" + "location=" + location + ", targetCallFrames=" + targetCallFrames + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.location);
        hash = 23 * hash + Objects.hashCode(this.targetCallFrames);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContinueToLocationRequest other = (ContinueToLocationRequest) obj;
        if (!Objects.equals(this.targetCallFrames, other.targetCallFrames)) {
            return false;
        }
        return Objects.equals(this.location, other.location);
    }
}
