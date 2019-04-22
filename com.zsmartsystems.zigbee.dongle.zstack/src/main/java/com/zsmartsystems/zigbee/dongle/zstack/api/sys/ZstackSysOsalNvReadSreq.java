/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.zstack.api.sys;

import com.zsmartsystems.zigbee.dongle.zstack.api.ZstackFrameRequest;
import com.zsmartsystems.zigbee.dongle.zstack.api.rpc.ZstackRpcSreqErrorSrsp;

/**
 * Class to implement the Z-Stack command <b>SYS_OSAL_NV_READ</b>.
 * <p>
 * This command is used to read a single memory item from the target non-volatile memory. The command accepts an attribute Id value
 * and data offset and returns the memory value present in the target for the specified attribute Id.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson
 */
public class ZstackSysOsalNvReadSreq extends ZstackFrameRequest {

    /**
     * The Id of the NV item.
     */
    private ZstackConfigId id;

    /**
     * Number of bytes offset from the beginning or the NV value.
     */
    private int offset;

    /**
     * Request constructor
     */
    public ZstackSysOsalNvReadSreq() {
        synchronousCommand = true;
    }

    /**
     * The Id of the NV item.
     *
     * @return the current id as {@link ZstackConfigId}
     */
    public ZstackConfigId getId() {
        return id;
    }

    /**
     * The Id of the NV item.
     *
     * @param id the id to set as {@link ZstackConfigId}
     */
    public void setId(ZstackConfigId id) {
        this.id = id;
    }

    /**
     * Number of bytes offset from the beginning or the NV value.
     *
     * @return the current offset as {@link int}
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Number of bytes offset from the beginning or the NV value.
     *
     * @param offset the Offset to set as {@link int}
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public boolean matchSreqError(ZstackRpcSreqErrorSrsp response) {
        return (((response.getReqCmd0() & 0x1F) == ZSTACK_SYS) && (response.getReqCmd1() == 0x08));
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(ZSTACK_SREQ, ZSTACK_SYS, 0x08);

        // Serialize the fields
        serializer.serializeUInt8(id.getKey());
        serializer.serializeUInt8(offset);
        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(76);
        builder.append("ZstackSysOsalNvReadSreq [id=");
        builder.append(id);
        builder.append(", offset=");
        builder.append(offset);
        builder.append(']');
        return builder.toString();
    }
}
