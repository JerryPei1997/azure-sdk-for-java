/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Rollout;
import rx.Observable;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Identity;
import java.util.List;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.StepGroup;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.RolloutOperationInfo;
import java.util.ArrayList;
import rx.functions.Func1;

class RolloutImpl extends GroupableResourceCoreImpl<Rollout, RolloutInner, RolloutImpl, DeploymentManagerManager> implements Rollout, Rollout.Definition, Rollout.Update {
    private RolloutRequestInner createOrUpdateParameter;
    RolloutImpl(String name, RolloutInner inner, DeploymentManagerManager manager) {
        super(name, inner, manager);
        this.createOrUpdateParameter = new RolloutRequestInner();
    }

    private RolloutInner transformRolloutRequestInnerToRolloutInner(RolloutRequestInner resource) {
        return new RolloutInner().withBuildVersion(resource.buildVersion())
            .withArtifactSourceId(resource.artifactSourceId())
            .withTargetServiceTopologyId(resource.targetServiceTopologyId())
            .withStepGroups(resource.stepGroups());
    }

    @Override
    public Observable<Rollout> createResourceAsync() {
        RolloutsInner client = this.manager().inner().rollouts();
        this.createOrUpdateParameter.withLocation(inner().location());
        this.createOrUpdateParameter.withTags(inner().getTags());
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createOrUpdateParameter)
            .map(new Func1<RolloutRequestInner, RolloutInner>() {
                @Override
                public RolloutInner call(RolloutRequestInner resource) {
                    resetCreateUpdateParameters();
                    return transformRolloutRequestInnerToRolloutInner(resource);
                }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Rollout> updateResourceAsync() {
        RolloutsInner client = this.manager().inner().rollouts();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createOrUpdateParameter)
            .map(new Func1<RolloutRequestInner, RolloutInner>() {
                @Override
                public RolloutInner call(RolloutRequestInner resource) {
                    resetCreateUpdateParameters();
                    return transformRolloutRequestInnerToRolloutInner(resource);
                }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RolloutInner> getInnerAsync() {
        RolloutsInner client = this.manager().inner().rollouts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new RolloutRequestInner();
    }

    @Override
    public String artifactSourceId() {
        return this.inner().artifactSourceId();
    }

    @Override
    public String buildVersion() {
        return this.inner().buildVersion();
    }

    @Override
    public Identity identity() {
        return this.inner().identity();
    }

    @Override
    public RolloutOperationInfo operationInfo() {
        return this.inner().operationInfo();
    }

    @Override
    public List<ServiceInner> services() {
        return this.inner().services();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public List<StepGroup> stepGroups() {
        return this.inner().stepGroups();
    }

    @Override
    public String targetServiceTopologyId() {
        return this.inner().targetServiceTopologyId();
    }

    @Override
    public Integer totalRetryAttempts() {
        return this.inner().totalRetryAttempts();
    }

    @Override
    public RolloutImpl withBuildVersion(String buildVersion) {
        this.createOrUpdateParameter.withBuildVersion(buildVersion);
        return this;
    }

    @Override
    public RolloutImpl withIdentity(Identity identity) {
        this.createOrUpdateParameter.withIdentity(identity);
        return this;
    }

    @Override
    public RolloutImpl withStepGroups(List<StepGroup> stepGroups) {
        this.createOrUpdateParameter.withStepGroups(stepGroups);
        return this;
    }

    @Override
    public RolloutImpl withTargetServiceTopologyId(String targetServiceTopologyId) {
        this.createOrUpdateParameter.withTargetServiceTopologyId(targetServiceTopologyId);
        return this;
    }

    @Override
    public RolloutImpl withArtifactSourceId(String artifactSourceId) {
        this.createOrUpdateParameter.withArtifactSourceId(artifactSourceId);
        return this;
    }

}
