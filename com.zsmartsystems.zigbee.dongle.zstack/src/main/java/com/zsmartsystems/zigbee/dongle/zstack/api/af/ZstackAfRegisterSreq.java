/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.zstack.api.af;

import com.zsmartsystems.zigbee.dongle.zstack.api.ZstackFrameRequest;
import com.zsmartsystems.zigbee.dongle.zstack.api.rpc.ZstackRpcSreqErrorSrsp;

/**
 * Class to implement the Z-Stack command <b>AF_REGISTER</b>.
 * <p>
 * This command enables the host processor to register an application’s endpoint description (and its simple descriptor).
 * Multiple endpoints may be registered with the AF by making multiple calls to AF_REGISTER. This could be useful in the case where
 * the device needs to support multiple application profiles, where each AF_REGISTER call would register a unique endpoint
 * description per application profile.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson
 */
public class ZstackAfRegisterSreq extends ZstackFrameRequest {

    /**
     * Specifies the endpoint of this simple descriptor.
     */
    private int endPoint;

    /**
     * Specifies the profile id of the application.
     */
    private int appProfId;

    /**
     * Specifies the device description id for this endpoint.
     */
    private int appDeviceId;

    /**
     * Specifies the device version number.
     */
    private int appDevVer;

    /**
     * Specifies latency. For ZigBee the only applicable value is 0x00. 0x00-No latency 0x01-fast beacons 0x02-slow beacons
     */
    private int latencyReq;

    /**
     * Specifies the list of Input Cluster Ids ( 2bytes each ).
     */
    private int[] appInClusterList;

    /**
     * Specifies the list of Output Cluster Ids ( 2bytes each )
     */
    private int[] appOutClusterList;

    /**
     * Request constructor
     */
    public ZstackAfRegisterSreq() {
        synchronousCommand = true;
    }

    /**
     * Specifies the endpoint of this simple descriptor.
     *
     * @return the current endPoint as {@link int}
     */
    public int getEndPoint() {
        return endPoint;
    }

    /**
     * Specifies the endpoint of this simple descriptor.
     *
     * @param endPoint the EndPoint to set as {@link int}
     */
    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }

    /**
     * Specifies the profile id of the application.
     *
     * @return the current appProfId as {@link int}
     */
    public int getAppProfId() {
        return appProfId;
    }

    /**
     * Specifies the profile id of the application.
     *
     * @param appProfId the AppProfId to set as {@link int}
     */
    public void setAppProfId(int appProfId) {
        this.appProfId = appProfId;
    }

    /**
     * Specifies the device description id for this endpoint.
     *
     * @return the current appDeviceId as {@link int}
     */
    public int getAppDeviceId() {
        return appDeviceId;
    }

    /**
     * Specifies the device description id for this endpoint.
     *
     * @param appDeviceId the AppDeviceId to set as {@link int}
     */
    public void setAppDeviceId(int appDeviceId) {
        this.appDeviceId = appDeviceId;
    }

    /**
     * Specifies the device version number.
     *
     * @return the current appDevVer as {@link int}
     */
    public int getAppDevVer() {
        return appDevVer;
    }

    /**
     * Specifies the device version number.
     *
     * @param appDevVer the AppDevVer to set as {@link int}
     */
    public void setAppDevVer(int appDevVer) {
        this.appDevVer = appDevVer;
    }

    /**
     * Specifies latency. For ZigBee the only applicable value is 0x00. 0x00-No latency 0x01-fast beacons 0x02-slow beacons
     *
     * @return the current latencyReq as {@link int}
     */
    public int getLatencyReq() {
        return latencyReq;
    }

    /**
     * Specifies latency. For ZigBee the only applicable value is 0x00. 0x00-No latency 0x01-fast beacons 0x02-slow beacons
     *
     * @param latencyReq the LatencyReq to set as {@link int}
     */
    public void setLatencyReq(int latencyReq) {
        this.latencyReq = latencyReq;
    }

    /**
     * Specifies the list of Input Cluster Ids ( 2bytes each ).
     *
     * @return the current appInClusterList as {@link int[]}
     */
    public int[] getAppInClusterList() {
        return appInClusterList;
    }

    /**
     * Specifies the list of Input Cluster Ids ( 2bytes each ).
     *
     * @param appInClusterList the AppInClusterList to set as {@link int[]}
     */
    public void setAppInClusterList(int[] appInClusterList) {
        this.appInClusterList = appInClusterList;
    }

    /**
     * Specifies the list of Output Cluster Ids ( 2bytes each )
     *
     * @return the current appOutClusterList as {@link int[]}
     */
    public int[] getAppOutClusterList() {
        return appOutClusterList;
    }

    /**
     * Specifies the list of Output Cluster Ids ( 2bytes each )
     *
     * @param appOutClusterList the AppOutClusterList to set as {@link int[]}
     */
    public void setAppOutClusterList(int[] appOutClusterList) {
        this.appOutClusterList = appOutClusterList;
    }

    @Override
    public boolean matchSreqError(ZstackRpcSreqErrorSrsp response) {
        return (((response.getReqCmd0() & 0x1F) == ZSTACK_AF) && (response.getReqCmd1() == 0x00));
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(ZSTACK_SREQ, ZSTACK_AF, 0x00);

        // Serialize the fields
        serializer.serializeUInt8(endPoint);
        serializer.serializeUInt16(appProfId);
        serializer.serializeUInt16(appDeviceId);
        serializer.serializeUInt8(appDevVer);
        serializer.serializeUInt8(latencyReq);
        serializer.serializeUInt8(appInClusterList.length);
        serializer.serializeUInt16Array(appInClusterList);
        serializer.serializeUInt8(appOutClusterList.length);
        serializer.serializeUInt16Array(appOutClusterList);
        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(248);
        builder.append("ZstackAfRegisterSreq [endPoint=");
        builder.append(String.format("%02X", endPoint));
        builder.append(", appProfId=");
        builder.append(appProfId);
        builder.append(", appDeviceId=");
        builder.append(appDeviceId);
        builder.append(", appDevVer=");
        builder.append(appDevVer);
        builder.append(", latencyReq=");
        builder.append(latencyReq);
        builder.append(", appInClusterList=");
        for (int c = 0; c < appInClusterList.length; c++) {
            if (c > 0) {
                builder.append(' ');
            }
            builder.append(String.format("%02X", appInClusterList[c]));
        }
        builder.append(", appOutClusterList=");
        for (int c = 0; c < appOutClusterList.length; c++) {
            if (c > 0) {
                builder.append(' ');
            }
            builder.append(String.format("%02X", appOutClusterList[c]));
        }
        builder.append(']');
        return builder.toString();
    }
}
