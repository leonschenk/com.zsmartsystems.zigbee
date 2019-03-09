/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.zstack.api.sys;

import com.zsmartsystems.zigbee.dongle.zstack.api.ZstackFrameResponse;

/**
 * Class to implement the Z-Stack command <b>SYS_ZDIAGS_SAVE_STATS_TO_NV</b>.
 * <p>
 * This command is used to save the statistics table from RAM to NV.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson
 */
public class ZstackSysZdiagsSaveStatsToNvSrsp extends ZstackFrameResponse {

    /**
     * Milliseconds since last reset.
     */
    private int sysClock;

    /**
     * Response and Handler constructor
     */
    public ZstackSysZdiagsSaveStatsToNvSrsp(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        synchronousCommand = true;

        // Deserialize the fields
        sysClock = deserializeUInt32();
    }

    /**
     * Milliseconds since last reset.
     *
     * @return the current sysClock as {@link int}
     */
    public int getSysClock() {
        return sysClock;
    }

    /**
     * Milliseconds since last reset.
     *
     * @param sysClock the SysClock to set as {@link int}
     */
    public void setSysClock(int sysClock) {
        this.sysClock = sysClock;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(60);
        builder.append("ZstackSysZdiagsSaveStatsToNvSrsp [sysClock=");
        builder.append(sysClock);
        builder.append(']');
        return builder.toString();
    }
}
