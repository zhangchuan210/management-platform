package cn.com.cdboost.model;

import java.math.BigDecimal;
import java.util.Date;

public class Mote {
    private Long id;

    private String moteEui;

    private String appEui;

    private String moteLwAddr;

    private Long orgNo;

    private String moteName;

    private String moteModel;

    private String softwareVer;

    private String hardwareVer;

    private String manufacturer;

    private String moteType;

    private String appKey;

    private String nwsKey;

    private String appsKey;

    private Long moteNonce;

    private String ismBand;

    private String lorawanVer;

    private Integer coordType;

    private BigDecimal lng;

    private BigDecimal lat;

    private String province;

    private String city;

    private String district;

    private String installAddr;

    private String rxWindow;

    private Integer rx1Droffset;

    private Integer rxDelay;

    private Integer rx2Dr;

    private String rx2Frequency;

    private Integer batteryLevel;

    private Integer isReg;

    private Integer isOnline;

    private Integer isEnabled;

    private Date lastActiveTime;

    private Date createTime;

    private Integer createType;

    private Long createUserId;

    private String remark;

    private String customerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMoteEui() {
        return moteEui;
    }

    public void setMoteEui(String moteEui) {
        this.moteEui = moteEui == null ? null : moteEui.trim();
    }

    public String getAppEui() {
        return appEui;
    }

    public void setAppEui(String appEui) {
        this.appEui = appEui == null ? null : appEui.trim();
    }

    public String getMoteLwAddr() {
        return moteLwAddr;
    }

    public void setMoteLwAddr(String moteLwAddr) {
        this.moteLwAddr = moteLwAddr == null ? null : moteLwAddr.trim();
    }

    public Long getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(Long orgNo) {
        this.orgNo = orgNo;
    }

    public String getMoteName() {
        return moteName;
    }

    public void setMoteName(String moteName) {
        this.moteName = moteName == null ? null : moteName.trim();
    }

    public String getMoteModel() {
        return moteModel;
    }

    public void setMoteModel(String moteModel) {
        this.moteModel = moteModel == null ? null : moteModel.trim();
    }

    public String getSoftwareVer() {
        return softwareVer;
    }

    public void setSoftwareVer(String softwareVer) {
        this.softwareVer = softwareVer == null ? null : softwareVer.trim();
    }

    public String getHardwareVer() {
        return hardwareVer;
    }

    public void setHardwareVer(String hardwareVer) {
        this.hardwareVer = hardwareVer == null ? null : hardwareVer.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getMoteType() {
        return moteType;
    }

    public void setMoteType(String moteType) {
        this.moteType = moteType == null ? null : moteType.trim();
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    public String getNwsKey() {
        return nwsKey;
    }

    public void setNwsKey(String nwsKey) {
        this.nwsKey = nwsKey == null ? null : nwsKey.trim();
    }

    public String getAppsKey() {
        return appsKey;
    }

    public void setAppsKey(String appsKey) {
        this.appsKey = appsKey == null ? null : appsKey.trim();
    }

    public Long getMoteNonce() {
        return moteNonce;
    }

    public void setMoteNonce(Long moteNonce) {
        this.moteNonce = moteNonce;
    }

    public String getIsmBand() {
        return ismBand;
    }

    public void setIsmBand(String ismBand) {
        this.ismBand = ismBand == null ? null : ismBand.trim();
    }

    public String getLorawanVer() {
        return lorawanVer;
    }

    public void setLorawanVer(String lorawanVer) {
        this.lorawanVer = lorawanVer == null ? null : lorawanVer.trim();
    }

    public Integer getCoordType() {
        return coordType;
    }

    public void setCoordType(Integer coordType) {
        this.coordType = coordType;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getInstallAddr() {
        return installAddr;
    }

    public void setInstallAddr(String installAddr) {
        this.installAddr = installAddr == null ? null : installAddr.trim();
    }

    public String getRxWindow() {
        return rxWindow;
    }

    public void setRxWindow(String rxWindow) {
        this.rxWindow = rxWindow == null ? null : rxWindow.trim();
    }

    public Integer getRx1Droffset() {
        return rx1Droffset;
    }

    public void setRx1Droffset(Integer rx1Droffset) {
        this.rx1Droffset = rx1Droffset;
    }

    public Integer getRxDelay() {
        return rxDelay;
    }

    public void setRxDelay(Integer rxDelay) {
        this.rxDelay = rxDelay;
    }

    public Integer getRx2Dr() {
        return rx2Dr;
    }

    public void setRx2Dr(Integer rx2Dr) {
        this.rx2Dr = rx2Dr;
    }

    public String getRx2Frequency() {
        return rx2Frequency;
    }

    public void setRx2Frequency(String rx2Frequency) {
        this.rx2Frequency = rx2Frequency == null ? null : rx2Frequency.trim();
    }

    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Integer getIsReg() {
        return isReg;
    }

    public void setIsReg(Integer isReg) {
        this.isReg = isReg;
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Date getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Date lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateType() {
        return createType;
    }

    public void setCreateType(Integer createType) {
        this.createType = createType;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }
}