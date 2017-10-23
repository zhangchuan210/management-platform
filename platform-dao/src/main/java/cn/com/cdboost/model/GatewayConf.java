package cn.com.cdboost.model;

import java.math.BigDecimal;
import java.util.Date;

public class GatewayConf {
    private String gatewayEui;

    private String macAddress;

    private String gwIpAddress;

    private String gwIpMaskAddr;

    private String gwIpgwAddr;

    private String serverAddress;

    private Integer servPortUp;

    private Integer servPortDown;

    private Integer keepaliveInterval;

    private Integer statInterval;

    private Integer pushTimeoutMs;

    private Integer pullTimeoutMs;

    private Boolean forwardCrcValid;

    private Boolean forwardCrcError;

    private Boolean forwardCrcDisabled;

    private Boolean gpsEnabled;

    private Boolean fakeGps;

    private BigDecimal refLatitude;

    private BigDecimal refLongitude;

    private BigDecimal refAltitude;

    private Integer beaconPeriod;

    private Integer beaconFreqHz;

    private Integer beaconFreqNb;

    private Integer beaconFreqStep;

    private Integer beaconDatarate;

    private Integer beaconBwHz;

    private Integer beaconPower;

    private Integer beaconInfodesc;

    private Date readWriteTime;

    private Date updateTime;

    private Long updateUserId;

    private Integer sendFlag;

    public String getGatewayEui() {
        return gatewayEui;
    }

    public void setGatewayEui(String gatewayEui) {
        this.gatewayEui = gatewayEui == null ? null : gatewayEui.trim();
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    public String getGwIpAddress() {
        return gwIpAddress;
    }

    public void setGwIpAddress(String gwIpAddress) {
        this.gwIpAddress = gwIpAddress == null ? null : gwIpAddress.trim();
    }

    public String getGwIpMaskAddr() {
        return gwIpMaskAddr;
    }

    public void setGwIpMaskAddr(String gwIpMaskAddr) {
        this.gwIpMaskAddr = gwIpMaskAddr == null ? null : gwIpMaskAddr.trim();
    }

    public String getGwIpgwAddr() {
        return gwIpgwAddr;
    }

    public void setGwIpgwAddr(String gwIpgwAddr) {
        this.gwIpgwAddr = gwIpgwAddr == null ? null : gwIpgwAddr.trim();
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress == null ? null : serverAddress.trim();
    }

    public Integer getServPortUp() {
        return servPortUp;
    }

    public void setServPortUp(Integer servPortUp) {
        this.servPortUp = servPortUp;
    }

    public Integer getServPortDown() {
        return servPortDown;
    }

    public void setServPortDown(Integer servPortDown) {
        this.servPortDown = servPortDown;
    }

    public Integer getKeepaliveInterval() {
        return keepaliveInterval;
    }

    public void setKeepaliveInterval(Integer keepaliveInterval) {
        this.keepaliveInterval = keepaliveInterval;
    }

    public Integer getStatInterval() {
        return statInterval;
    }

    public void setStatInterval(Integer statInterval) {
        this.statInterval = statInterval;
    }

    public Integer getPushTimeoutMs() {
        return pushTimeoutMs;
    }

    public void setPushTimeoutMs(Integer pushTimeoutMs) {
        this.pushTimeoutMs = pushTimeoutMs;
    }

    public Integer getPullTimeoutMs() {
        return pullTimeoutMs;
    }

    public void setPullTimeoutMs(Integer pullTimeoutMs) {
        this.pullTimeoutMs = pullTimeoutMs;
    }

    public Boolean getForwardCrcValid() {
        return forwardCrcValid;
    }

    public void setForwardCrcValid(Boolean forwardCrcValid) {
        this.forwardCrcValid = forwardCrcValid;
    }

    public Boolean getForwardCrcError() {
        return forwardCrcError;
    }

    public void setForwardCrcError(Boolean forwardCrcError) {
        this.forwardCrcError = forwardCrcError;
    }

    public Boolean getForwardCrcDisabled() {
        return forwardCrcDisabled;
    }

    public void setForwardCrcDisabled(Boolean forwardCrcDisabled) {
        this.forwardCrcDisabled = forwardCrcDisabled;
    }

    public Boolean getGpsEnabled() {
        return gpsEnabled;
    }

    public void setGpsEnabled(Boolean gpsEnabled) {
        this.gpsEnabled = gpsEnabled;
    }

    public Boolean getFakeGps() {
        return fakeGps;
    }

    public void setFakeGps(Boolean fakeGps) {
        this.fakeGps = fakeGps;
    }

    public BigDecimal getRefLatitude() {
        return refLatitude;
    }

    public void setRefLatitude(BigDecimal refLatitude) {
        this.refLatitude = refLatitude;
    }

    public BigDecimal getRefLongitude() {
        return refLongitude;
    }

    public void setRefLongitude(BigDecimal refLongitude) {
        this.refLongitude = refLongitude;
    }

    public BigDecimal getRefAltitude() {
        return refAltitude;
    }

    public void setRefAltitude(BigDecimal refAltitude) {
        this.refAltitude = refAltitude;
    }

    public Integer getBeaconPeriod() {
        return beaconPeriod;
    }

    public void setBeaconPeriod(Integer beaconPeriod) {
        this.beaconPeriod = beaconPeriod;
    }

    public Integer getBeaconFreqHz() {
        return beaconFreqHz;
    }

    public void setBeaconFreqHz(Integer beaconFreqHz) {
        this.beaconFreqHz = beaconFreqHz;
    }

    public Integer getBeaconFreqNb() {
        return beaconFreqNb;
    }

    public void setBeaconFreqNb(Integer beaconFreqNb) {
        this.beaconFreqNb = beaconFreqNb;
    }

    public Integer getBeaconFreqStep() {
        return beaconFreqStep;
    }

    public void setBeaconFreqStep(Integer beaconFreqStep) {
        this.beaconFreqStep = beaconFreqStep;
    }

    public Integer getBeaconDatarate() {
        return beaconDatarate;
    }

    public void setBeaconDatarate(Integer beaconDatarate) {
        this.beaconDatarate = beaconDatarate;
    }

    public Integer getBeaconBwHz() {
        return beaconBwHz;
    }

    public void setBeaconBwHz(Integer beaconBwHz) {
        this.beaconBwHz = beaconBwHz;
    }

    public Integer getBeaconPower() {
        return beaconPower;
    }

    public void setBeaconPower(Integer beaconPower) {
        this.beaconPower = beaconPower;
    }

    public Integer getBeaconInfodesc() {
        return beaconInfodesc;
    }

    public void setBeaconInfodesc(Integer beaconInfodesc) {
        this.beaconInfodesc = beaconInfodesc;
    }

    public Date getReadWriteTime() {
        return readWriteTime;
    }

    public void setReadWriteTime(Date readWriteTime) {
        this.readWriteTime = readWriteTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Integer getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(Integer sendFlag) {
        this.sendFlag = sendFlag;
    }
}