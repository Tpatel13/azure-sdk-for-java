/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a Virtual Machine Extension.
 */
@JsonFlatten
public class VirtualMachineExtensionUpdate extends UpdateResource {
    /**
     * How the extension handler should be forced to update even if the
     * extension configuration has not changed.
     */
    @JsonProperty(value = "properties.forceUpdateTag")
    private String forceUpdateTag;

    /**
     * The name of the extension handler publisher.
     */
    @JsonProperty(value = "properties.publisher")
    private String publisher;

    /**
     * Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     */
    @JsonProperty(value = "properties.type")
    private String virtualMachineExtensionUpdateType;

    /**
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "properties.typeHandlerVersion")
    private String typeHandlerVersion;

    /**
     * Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension
     * will not upgrade minor versions unless redeployed, even with this
     * property set to true.
     */
    @JsonProperty(value = "properties.autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /**
     * Json formatted public settings for the extension.
     */
    @JsonProperty(value = "properties.settings")
    private Object settings;

    /**
     * The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     */
    @JsonProperty(value = "properties.protectedSettings")
    private Object protectedSettings;

    /**
     * Get how the extension handler should be forced to update even if the extension configuration has not changed.
     *
     * @return the forceUpdateTag value
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set how the extension handler should be forced to update even if the extension configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set
     * @return the VirtualMachineExtensionUpdate object itself.
     */
    public VirtualMachineExtensionUpdate withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the name of the extension handler publisher.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the name of the extension handler publisher.
     *
     * @param publisher the publisher value to set
     * @return the VirtualMachineExtensionUpdate object itself.
     */
    public VirtualMachineExtensionUpdate withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the virtualMachineExtensionUpdateType value
     */
    public String virtualMachineExtensionUpdateType() {
        return this.virtualMachineExtensionUpdateType;
    }

    /**
     * Set specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param virtualMachineExtensionUpdateType the virtualMachineExtensionUpdateType value to set
     * @return the VirtualMachineExtensionUpdate object itself.
     */
    public VirtualMachineExtensionUpdate withVirtualMachineExtensionUpdateType(String virtualMachineExtensionUpdateType) {
        this.virtualMachineExtensionUpdateType = virtualMachineExtensionUpdateType;
        return this;
    }

    /**
     * Get specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set
     * @return the VirtualMachineExtensionUpdate object itself.
     */
    public VirtualMachineExtensionUpdate withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set
     * @return the VirtualMachineExtensionUpdate object itself.
     */
    public VirtualMachineExtensionUpdate withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get json formatted public settings for the extension.
     *
     * @return the settings value
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set json formatted public settings for the extension.
     *
     * @param settings the settings value to set
     * @return the VirtualMachineExtensionUpdate object itself.
     */
    public VirtualMachineExtensionUpdate withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @return the protectedSettings value
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @param protectedSettings the protectedSettings value to set
     * @return the VirtualMachineExtensionUpdate object itself.
     */
    public VirtualMachineExtensionUpdate withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

}
