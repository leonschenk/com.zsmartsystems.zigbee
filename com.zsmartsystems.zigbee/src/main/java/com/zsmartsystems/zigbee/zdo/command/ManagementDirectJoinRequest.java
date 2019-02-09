/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zdo.command;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zdo.ZdoRequest;

/**
 * Management Direct Join Request value object class.
 * <p>
 * <p>
 * The Mgmt_Direct_Join_req is generated from a Local Device requesting that a Remote Device
 * permit a device designated by DeviceAddress to join the network directly. The
 * Mgmt_Direct_Join_req is generated by a management application which directs the request
 * to a Remote Device where the NLME-DIRECTJOIN.request is to be executed using the parameter
 * supplied by Mgmt_Direct_Join_req.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-02-09T15:23:12Z")
public class ManagementDirectJoinRequest extends ZdoRequest {
    /**
     * Device Address command message field.
     */
    private IeeeAddress deviceAddress;

    /**
     * Capability Information command message field.
     */
    private Integer capabilityInformation;

    /**
     * Default constructor.
     */
    public ManagementDirectJoinRequest() {
        clusterId = 0x0035;
    }

    /**
     * Gets Device Address.
     *
     * @return the Device Address
     */
    public IeeeAddress getDeviceAddress() {
        return deviceAddress;
    }

    /**
     * Sets Device Address.
     *
     * @param deviceAddress the Device Address
     */
    public void setDeviceAddress(final IeeeAddress deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    /**
     * Gets Capability Information.
     *
     * @return the Capability Information
     */
    public Integer getCapabilityInformation() {
        return capabilityInformation;
    }

    /**
     * Sets Capability Information.
     *
     * @param capabilityInformation the Capability Information
     */
    public void setCapabilityInformation(final Integer capabilityInformation) {
        this.capabilityInformation = capabilityInformation;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        super.serialize(serializer);

        serializer.serialize(deviceAddress, ZclDataType.IEEE_ADDRESS);
        serializer.serialize(capabilityInformation, ZclDataType.BITMAP_8_BIT);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        super.deserialize(deserializer);

        deviceAddress = (IeeeAddress) deserializer.deserialize(ZclDataType.IEEE_ADDRESS);
        capabilityInformation = (Integer) deserializer.deserialize(ZclDataType.BITMAP_8_BIT);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(104);
        builder.append("ManagementDirectJoinRequest [");
        builder.append(super.toString());
        builder.append(", deviceAddress=");
        builder.append(deviceAddress);
        builder.append(", capabilityInformation=");
        builder.append(capabilityInformation);
        builder.append(']');
        return builder.toString();
    }

}
