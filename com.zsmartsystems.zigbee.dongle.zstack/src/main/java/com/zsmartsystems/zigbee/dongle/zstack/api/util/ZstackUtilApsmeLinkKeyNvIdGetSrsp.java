/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.zstack.api.util;

import com.zsmartsystems.zigbee.dongle.zstack.api.ZstackFrameResponse;
import com.zsmartsystems.zigbee.dongle.zstack.api.ZstackResponseCode;

/**
 * Class to implement the Z-Stack command <b>UTIL_APSME_LINK_KEY_NV_ID_GET</b>.
 * <p>
 * This command is a proxy call to the APSME_LinkKeyNvIdGet() function.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson
 */
public class ZstackUtilApsmeLinkKeyNvIdGetSrsp extends ZstackFrameResponse {

    /**
     * The ZStatus_t returned by the proxy call to APSME_LinkKeyNVIdGet().
     */
    private ZstackResponseCode status;

    /**
     * On success, link key NV ID. Otherwise 0xFFFF
     */
    private int linkKeyNvId;

    /**
     * Response and Handler constructor
     */
    public ZstackUtilApsmeLinkKeyNvIdGetSrsp(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        synchronousCommand = true;

        // Deserialize the fields
        status = ZstackResponseCode.valueOf(deserializeUInt8());
        linkKeyNvId = deserializeUInt16();
    }

    /**
     * The ZStatus_t returned by the proxy call to APSME_LinkKeyNVIdGet().
     *
     * @return the current status as {@link ZstackResponseCode}
     */
    public ZstackResponseCode getStatus() {
        return status;
    }

    /**
     * The ZStatus_t returned by the proxy call to APSME_LinkKeyNVIdGet().
     *
     * @param status the Status to set as {@link ZstackResponseCode}
     */
    public void setStatus(ZstackResponseCode status) {
        this.status = status;
    }

    /**
     * On success, link key NV ID. Otherwise 0xFFFF
     *
     * @return the current linkKeyNvId as {@link int}
     */
    public int getLinkKeyNvId() {
        return linkKeyNvId;
    }

    /**
     * On success, link key NV ID. Otherwise 0xFFFF
     *
     * @param linkKeyNvId the LinkKeyNvId to set as {@link int}
     */
    public void setLinkKeyNvId(int linkKeyNvId) {
        this.linkKeyNvId = linkKeyNvId;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(86);
        builder.append("ZstackUtilApsmeLinkKeyNvIdGetSrsp [status=");
        builder.append(status);
        builder.append(", linkKeyNvId=");
        builder.append(linkKeyNvId);
        builder.append(']');
        return builder.toString();
    }
}
