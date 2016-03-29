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


/**
 * Information about the compute node on which a task ran.
 */
public class ComputeNodeInformation {
    /**
     * Gets or sets an identifier for the compute node on which the task ran,
     * which can be passed when adding a task to request that the task be
     * scheduled close to this compute node.
     */
    private String affinityId;

    /**
     * Gets or sets the URL of the node on which the task ran.
     */
    private String nodeUrl;

    /**
     * Gets or sets the id of the pool on which the task ran.
     */
    private String poolId;

    /**
     * Gets or sets the id of the node on which the task ran.
     */
    private String nodeId;

    /**
     * Gets or sets the root directory of the task on the compute node.
     */
    private String taskRootDirectory;

    /**
     * Gets or sets the URL to the root directory of the task on the compute
     * node.
     */
    private String taskRootDirectoryUrl;

    /**
     * Get the affinityId value.
     *
     * @return the affinityId value
     */
    public String getAffinityId() {
        return this.affinityId;
    }

    /**
     * Set the affinityId value.
     *
     * @param affinityId the affinityId value to set
     */
    public void setAffinityId(String affinityId) {
        this.affinityId = affinityId;
    }

    /**
     * Get the nodeUrl value.
     *
     * @return the nodeUrl value
     */
    public String getNodeUrl() {
        return this.nodeUrl;
    }

    /**
     * Set the nodeUrl value.
     *
     * @param nodeUrl the nodeUrl value to set
     */
    public void setNodeUrl(String nodeUrl) {
        this.nodeUrl = nodeUrl;
    }

    /**
     * Get the poolId value.
     *
     * @return the poolId value
     */
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * Set the poolId value.
     *
     * @param poolId the poolId value to set
     */
    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * Get the nodeId value.
     *
     * @return the nodeId value
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * Set the nodeId value.
     *
     * @param nodeId the nodeId value to set
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Get the taskRootDirectory value.
     *
     * @return the taskRootDirectory value
     */
    public String getTaskRootDirectory() {
        return this.taskRootDirectory;
    }

    /**
     * Set the taskRootDirectory value.
     *
     * @param taskRootDirectory the taskRootDirectory value to set
     */
    public void setTaskRootDirectory(String taskRootDirectory) {
        this.taskRootDirectory = taskRootDirectory;
    }

    /**
     * Get the taskRootDirectoryUrl value.
     *
     * @return the taskRootDirectoryUrl value
     */
    public String getTaskRootDirectoryUrl() {
        return this.taskRootDirectoryUrl;
    }

    /**
     * Set the taskRootDirectoryUrl value.
     *
     * @param taskRootDirectoryUrl the taskRootDirectoryUrl value to set
     */
    public void setTaskRootDirectoryUrl(String taskRootDirectoryUrl) {
        this.taskRootDirectoryUrl = taskRootDirectoryUrl;
    }

}
