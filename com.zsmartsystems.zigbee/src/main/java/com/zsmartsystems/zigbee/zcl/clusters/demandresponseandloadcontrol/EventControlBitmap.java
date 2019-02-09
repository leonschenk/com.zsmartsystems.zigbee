/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.demandresponseandloadcontrol;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

/**
 * Event Control value enumeration.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-02-09T15:28:08Z")
public enum EventControlBitmap {

    /**
     * Randomized Start Time
     */
    RANDOMIZED_START_TIME(0x0001),

    /**
     * Randomized End Time
     */
    RANDOMIZED_END_TIME(0x0002);

    /**
     * A mapping between the integer code and its corresponding EventControlBitmap type to facilitate lookup by value.
     */
    private static Map<Integer, EventControlBitmap> idMap;

    static {
        idMap = new HashMap<Integer, EventControlBitmap>();
        for (EventControlBitmap enumValue : values()) {
            idMap.put(enumValue.key, enumValue);
        }
    }

    private final int key;

    private EventControlBitmap(final int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public static EventControlBitmap getByValue(final int value) {
        return idMap.get(value);
    }
}
