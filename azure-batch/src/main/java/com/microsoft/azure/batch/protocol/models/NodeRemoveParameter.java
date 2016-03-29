/**
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for a ComputeNodeOperations.Remove request.
 */
public class NodeRemoveParameter {
    /**
     * Sets a list containing the id of the compute nodes to be removed from
     * the specified pool.
     */
    @JsonProperty(required = true)
    private List<String> nodeList;

    /**
     * Sets the timeout for removal of compute nodes to the pool. The default
     * value is 10 minutes.
     */
    private Period resizeTimeout;

    /**
     * Sets when compute nodes may be removed from the pool. Possible values
     * include: 'requeue', 'terminate', 'taskcompletion', 'retaineddata'.
     */
    private ComputeNodeDeallocationOption nodeDeallocationOption;

    /**
     * Get the nodeList value.
     *
     * @return the nodeList value
     */
    public List<String> getNodeList() {
        return this.nodeList;
    }

    /**
     * Set the nodeList value.
     *
     * @param nodeList the nodeList value to set
     */
    public void setNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
    }

    /**
     * Get the resizeTimeout value.
     *
     * @return the resizeTimeout value
     */
    public Period getResizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the resizeTimeout value.
     *
     * @param resizeTimeout the resizeTimeout value to set
     */
    public void setResizeTimeout(Period resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
    }

    /**
     * Get the nodeDeallocationOption value.
     *
     * @return the nodeDeallocationOption value
     */
    public ComputeNodeDeallocationOption getNodeDeallocationOption() {
        return this.nodeDeallocationOption;
    }

    /**
     * Set the nodeDeallocationOption value.
     *
     * @param nodeDeallocationOption the nodeDeallocationOption value to set
     */
    public void setNodeDeallocationOption(ComputeNodeDeallocationOption nodeDeallocationOption) {
        this.nodeDeallocationOption = nodeDeallocationOption;
    }

}
