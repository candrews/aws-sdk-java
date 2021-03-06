/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPatchBaselineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the retrieved patch baseline.
     * </p>
     */
    private String baselineId;
    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Returns the operating system specified for the patch baseline.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     */
    private PatchFilterGroup globalFilters;
    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     */
    private PatchRuleGroup approvalRules;
    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> approvedPatches;
    /**
     * <p>
     * Returns the specified compliance severity level for approved patches in the patch baseline.
     * </p>
     */
    private String approvedPatchesComplianceLevel;
    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> rejectedPatches;
    /**
     * <p>
     * Patch groups included in the patch baseline.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> patchGroups;
    /**
     * <p>
     * The date the patch baseline was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date the patch baseline was last modified.
     * </p>
     */
    private java.util.Date modifiedDate;
    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the retrieved patch baseline.
     * </p>
     * 
     * @param baselineId
     *        The ID of the retrieved patch baseline.
     */

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the retrieved patch baseline.
     * </p>
     * 
     * @return The ID of the retrieved patch baseline.
     */

    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * <p>
     * The ID of the retrieved patch baseline.
     * </p>
     * 
     * @param baselineId
     *        The ID of the retrieved patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withBaselineId(String baselineId) {
        setBaselineId(baselineId);
        return this;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * 
     * @param name
     *        The name of the patch baseline.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * 
     * @return The name of the patch baseline.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * 
     * @param name
     *        The name of the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Returns the operating system specified for the patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        Returns the operating system specified for the patch baseline.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Returns the operating system specified for the patch baseline.
     * </p>
     * 
     * @return Returns the operating system specified for the patch baseline.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Returns the operating system specified for the patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        Returns the operating system specified for the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public GetPatchBaselineResult withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * Returns the operating system specified for the patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        Returns the operating system specified for the patch baseline.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * Returns the operating system specified for the patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        Returns the operating system specified for the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public GetPatchBaselineResult withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     * 
     * @param globalFilters
     *        A set of global filters used to exclude patches from the baseline.
     */

    public void setGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     * 
     * @return A set of global filters used to exclude patches from the baseline.
     */

    public PatchFilterGroup getGlobalFilters() {
        return this.globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     * 
     * @param globalFilters
     *        A set of global filters used to exclude patches from the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withGlobalFilters(PatchFilterGroup globalFilters) {
        setGlobalFilters(globalFilters);
        return this;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     * 
     * @param approvalRules
     *        A set of rules used to include patches in the baseline.
     */

    public void setApprovalRules(PatchRuleGroup approvalRules) {
        this.approvalRules = approvalRules;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     * 
     * @return A set of rules used to include patches in the baseline.
     */

    public PatchRuleGroup getApprovalRules() {
        return this.approvalRules;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     * 
     * @param approvalRules
     *        A set of rules used to include patches in the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withApprovalRules(PatchRuleGroup approvalRules) {
        setApprovalRules(approvalRules);
        return this;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * 
     * @return A list of explicitly approved patches for the baseline.
     */

    public java.util.List<String> getApprovedPatches() {
        if (approvedPatches == null) {
            approvedPatches = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return approvedPatches;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.
     */

    public void setApprovedPatches(java.util.Collection<String> approvedPatches) {
        if (approvedPatches == null) {
            this.approvedPatches = null;
            return;
        }

        this.approvedPatches = new com.amazonaws.internal.SdkInternalList<String>(approvedPatches);
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApprovedPatches(java.util.Collection)} or {@link #withApprovedPatches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withApprovedPatches(String... approvedPatches) {
        if (this.approvedPatches == null) {
            setApprovedPatches(new com.amazonaws.internal.SdkInternalList<String>(approvedPatches.length));
        }
        for (String ele : approvedPatches) {
            this.approvedPatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withApprovedPatches(java.util.Collection<String> approvedPatches) {
        setApprovedPatches(approvedPatches);
        return this;
    }

    /**
     * <p>
     * Returns the specified compliance severity level for approved patches in the patch baseline.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Returns the specified compliance severity level for approved patches in the patch baseline.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Returns the specified compliance severity level for approved patches in the patch baseline.
     * </p>
     * 
     * @return Returns the specified compliance severity level for approved patches in the patch baseline.
     * @see PatchComplianceLevel
     */

    public String getApprovedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Returns the specified compliance severity level for approved patches in the patch baseline.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Returns the specified compliance severity level for approved patches in the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public GetPatchBaselineResult withApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        setApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
        return this;
    }

    /**
     * <p>
     * Returns the specified compliance severity level for approved patches in the patch baseline.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Returns the specified compliance severity level for approved patches in the patch baseline.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
        withApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
    }

    /**
     * <p>
     * Returns the specified compliance severity level for approved patches in the patch baseline.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Returns the specified compliance severity level for approved patches in the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public GetPatchBaselineResult withApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel.toString();
        return this;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * 
     * @return A list of explicitly rejected patches for the baseline.
     */

    public java.util.List<String> getRejectedPatches() {
        if (rejectedPatches == null) {
            rejectedPatches = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return rejectedPatches;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.
     */

    public void setRejectedPatches(java.util.Collection<String> rejectedPatches) {
        if (rejectedPatches == null) {
            this.rejectedPatches = null;
            return;
        }

        this.rejectedPatches = new com.amazonaws.internal.SdkInternalList<String>(rejectedPatches);
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRejectedPatches(java.util.Collection)} or {@link #withRejectedPatches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withRejectedPatches(String... rejectedPatches) {
        if (this.rejectedPatches == null) {
            setRejectedPatches(new com.amazonaws.internal.SdkInternalList<String>(rejectedPatches.length));
        }
        for (String ele : rejectedPatches) {
            this.rejectedPatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withRejectedPatches(java.util.Collection<String> rejectedPatches) {
        setRejectedPatches(rejectedPatches);
        return this;
    }

    /**
     * <p>
     * Patch groups included in the patch baseline.
     * </p>
     * 
     * @return Patch groups included in the patch baseline.
     */

    public java.util.List<String> getPatchGroups() {
        if (patchGroups == null) {
            patchGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return patchGroups;
    }

    /**
     * <p>
     * Patch groups included in the patch baseline.
     * </p>
     * 
     * @param patchGroups
     *        Patch groups included in the patch baseline.
     */

    public void setPatchGroups(java.util.Collection<String> patchGroups) {
        if (patchGroups == null) {
            this.patchGroups = null;
            return;
        }

        this.patchGroups = new com.amazonaws.internal.SdkInternalList<String>(patchGroups);
    }

    /**
     * <p>
     * Patch groups included in the patch baseline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPatchGroups(java.util.Collection)} or {@link #withPatchGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param patchGroups
     *        Patch groups included in the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withPatchGroups(String... patchGroups) {
        if (this.patchGroups == null) {
            setPatchGroups(new com.amazonaws.internal.SdkInternalList<String>(patchGroups.length));
        }
        for (String ele : patchGroups) {
            this.patchGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Patch groups included in the patch baseline.
     * </p>
     * 
     * @param patchGroups
     *        Patch groups included in the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withPatchGroups(java.util.Collection<String> patchGroups) {
        setPatchGroups(patchGroups);
        return this;
    }

    /**
     * <p>
     * The date the patch baseline was created.
     * </p>
     * 
     * @param createdDate
     *        The date the patch baseline was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the patch baseline was created.
     * </p>
     * 
     * @return The date the patch baseline was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the patch baseline was created.
     * </p>
     * 
     * @param createdDate
     *        The date the patch baseline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date the patch baseline was last modified.
     * </p>
     * 
     * @param modifiedDate
     *        The date the patch baseline was last modified.
     */

    public void setModifiedDate(java.util.Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * <p>
     * The date the patch baseline was last modified.
     * </p>
     * 
     * @return The date the patch baseline was last modified.
     */

    public java.util.Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * <p>
     * The date the patch baseline was last modified.
     * </p>
     * 
     * @param modifiedDate
     *        The date the patch baseline was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withModifiedDate(java.util.Date modifiedDate) {
        setModifiedDate(modifiedDate);
        return this;
    }

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * 
     * @param description
     *        A description of the patch baseline.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * 
     * @return A description of the patch baseline.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * 
     * @param description
     *        A description of the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBaselineId() != null)
            sb.append("BaselineId: ").append(getBaselineId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getGlobalFilters() != null)
            sb.append("GlobalFilters: ").append(getGlobalFilters()).append(",");
        if (getApprovalRules() != null)
            sb.append("ApprovalRules: ").append(getApprovalRules()).append(",");
        if (getApprovedPatches() != null)
            sb.append("ApprovedPatches: ").append(getApprovedPatches()).append(",");
        if (getApprovedPatchesComplianceLevel() != null)
            sb.append("ApprovedPatchesComplianceLevel: ").append(getApprovedPatchesComplianceLevel()).append(",");
        if (getRejectedPatches() != null)
            sb.append("RejectedPatches: ").append(getRejectedPatches()).append(",");
        if (getPatchGroups() != null)
            sb.append("PatchGroups: ").append(getPatchGroups()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getModifiedDate() != null)
            sb.append("ModifiedDate: ").append(getModifiedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPatchBaselineResult == false)
            return false;
        GetPatchBaselineResult other = (GetPatchBaselineResult) obj;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getGlobalFilters() == null ^ this.getGlobalFilters() == null)
            return false;
        if (other.getGlobalFilters() != null && other.getGlobalFilters().equals(this.getGlobalFilters()) == false)
            return false;
        if (other.getApprovalRules() == null ^ this.getApprovalRules() == null)
            return false;
        if (other.getApprovalRules() != null && other.getApprovalRules().equals(this.getApprovalRules()) == false)
            return false;
        if (other.getApprovedPatches() == null ^ this.getApprovedPatches() == null)
            return false;
        if (other.getApprovedPatches() != null && other.getApprovedPatches().equals(this.getApprovedPatches()) == false)
            return false;
        if (other.getApprovedPatchesComplianceLevel() == null ^ this.getApprovedPatchesComplianceLevel() == null)
            return false;
        if (other.getApprovedPatchesComplianceLevel() != null
                && other.getApprovedPatchesComplianceLevel().equals(this.getApprovedPatchesComplianceLevel()) == false)
            return false;
        if (other.getRejectedPatches() == null ^ this.getRejectedPatches() == null)
            return false;
        if (other.getRejectedPatches() != null && other.getRejectedPatches().equals(this.getRejectedPatches()) == false)
            return false;
        if (other.getPatchGroups() == null ^ this.getPatchGroups() == null)
            return false;
        if (other.getPatchGroups() != null && other.getPatchGroups().equals(this.getPatchGroups()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getModifiedDate() == null ^ this.getModifiedDate() == null)
            return false;
        if (other.getModifiedDate() != null && other.getModifiedDate().equals(this.getModifiedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getGlobalFilters() == null) ? 0 : getGlobalFilters().hashCode());
        hashCode = prime * hashCode + ((getApprovalRules() == null) ? 0 : getApprovalRules().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatches() == null) ? 0 : getApprovedPatches().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatchesComplianceLevel() == null) ? 0 : getApprovedPatchesComplianceLevel().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatches() == null) ? 0 : getRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getPatchGroups() == null) ? 0 : getPatchGroups().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getModifiedDate() == null) ? 0 : getModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public GetPatchBaselineResult clone() {
        try {
            return (GetPatchBaselineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
