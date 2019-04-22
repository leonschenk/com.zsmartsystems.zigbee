/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.zstack.api.zdo;

import com.zsmartsystems.zigbee.dongle.zstack.api.ZstackFrameResponse;
import com.zsmartsystems.zigbee.dongle.zstack.api.sys.ZstackZdoState;

/**
 * Class to implement the Z-Stack command <b>ZDO_STATE_CHANGE_IND</b>.
 * <p>
 * This callback message indicates the ZDO state change.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson
 */
public class ZstackZdoStateChangeIndAreq extends ZstackFrameResponse {

    /**
     * Specifies the changed ZDO state. An enumerated list starting from 0.
     */
    private ZstackZdoState state;

    /**
     * Response and Handler constructor
     */
    public ZstackZdoStateChangeIndAreq(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        state = ZstackZdoState.valueOf(deserializer.deserializeUInt8());
    }

    /**
     * Specifies the changed ZDO state. An enumerated list starting from 0.
     *
     * @return the current state as {@link ZstackZdoState}
     */
    public ZstackZdoState getState() {
        return state;
    }

    /**
     * Specifies the changed ZDO state. An enumerated list starting from 0.
     *
     * @param state the State to set as {@link ZstackZdoState}
     */
    public void setState(ZstackZdoState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(55);
        builder.append("ZstackZdoStateChangeIndAreq [state=");
        builder.append(state);
        builder.append(']');
        return builder.toString();
    }
}
