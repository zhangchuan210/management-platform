package cn.com.cdboost.model;

import java.math.BigDecimal;
import java.util.Date;

public class Gateway {
    private Long id;

    private String gatewayEui;

    private Long orgNo;

    private String gatewayName;

    private String gatewayModel;

    private String softwareVer;

    private String hardwareVer;

    private String nwCode;

    private Integer coordType;

    private BigDecimal lng;

    private BigDecimal lat;

    private BigDecimal altitude;

    private String province;

    private String city;

    private String district;

    private String installAddr;

    private Integer rxnb;

    private Integer rxok;

    private Integer rxfw;

    private BigDecimal ackr;

    private Integer dwnb;

    private Integer txnb;

    private Integer isReg;

    private Integer isEnabled;

    private Integer isOnline;

    private Date lastActiveTime;

    private Date lastConnectTime;

    private Date createTime;

    private Integer createType;

    private Long createUserId;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGatewayEui() {
        return gatewayEui;
    }

    public void setGatewayEui(String gatewayEui) {
        this.gatewayEui = gatewayEui == null ? null : gatewayEui.trim();
    }

    public Long getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(Long orgNo) {
        this.orgNo = orgNo;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName == null ? null : gatewayName.trim();
    }

    public String getGatewayModel() {
        return gatewayModel;
    }

    public void setGatewayModel(String gatewayModel) {
        this.gatewayModel = gatewayModel == null ? null : gatewayModel.trim();
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

    public String getNwCode() {
        return nwCode;
    }

    public void setNwCode(String nwCode) {
        this.nwCode = nwCode == null ? null : nwCode.trim();
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

    public BigDecimal getAltitude() {
        return altitude;
    }

    public void setAltitude(BigDecimal altitude) {
        this.altitude = altitude;
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

    public Integer getRxnb() {
        return rxnb;
    }

    public void setRxnb(Integer rxnb) {
        this.rxnb = rxnb;
    }

    public Integer getRxok() {
        return rxok;
    }

    public void setRxok(Integer rxok) {
        this.rxok = rxok;
    }

    public Integer getRxfw() {
        return rxfw;
    }

    public void setRxfw(Integer rxfw) {
        this.rxfw = rxfw;
    }

    public BigDecimal getAckr() {
        return ackr;
    }

    public void setAckr(BigDecimal ackr) {
        this.ackr = ackr;
    }

    public Integer getDwnb() {
        return dwnb;
    }

    public void setDwnb(Integer dwnb) {
        this.dwnb = dwnb;
    }

    public Integer getTxnb() {
        return txnb;
    }

    public void setTxnb(Integer txnb) {
        this.txnb = txnb;
    }

    public Integer getIsReg() {
        return isReg;
    }

    public void setIsReg(Integer isReg) {
        this.isReg = isReg;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    public Date getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Date lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public Date getLastConnectTime() {
        return lastConnectTime;
    }

    public void setLastConnectTime(Date lastConnectTime) {
        this.lastConnectTime = lastConnectTime;
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
}