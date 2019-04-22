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
 * Class to implement the Z-Stack command <b>UTIL_SET_CHANNELS</b>.
 * <p>
 * This command is used to store a channel select bit-mask into Non-Volatile memory to be used the next time the target device
 * resets.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson
 */
public class ZstackUtilSetChannelsSrsp extends ZstackFrameResponse {

    /**
     * Status is either Success (0) or Failure (1).
     */
    private ZstackResponseCode status;

    /**
     * Response and Handler constructor
     */
    public ZstackUtilSetChannelsSrsp(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        synchronousCommand = true;

        // Deserialize the fields
        status = ZstackResponseCode.valueOf(deserializer.deserializeUInt8());
    }

    /**
     * Status is either Success (0) or Failure (1).
     *
     * @return the current status as {@link ZstackResponseCode}
     */
    public ZstackResponseCode getStatus() {
        return status;
    }

    /**
     * Status is either Success (0) or Failure (1).
     *
     * @param status the Status to set as {@link ZstackResponseCode}
     */
    public void setStatus(ZstackResponseCode status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(53);
        builder.append("ZstackUtilSetChannelsSrsp [status=");
        builder.append(status);
        builder.append(']');
        return builder.toString();
    }
}
