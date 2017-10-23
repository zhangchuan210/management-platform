package cn.com.cdboost.model;

import java.util.Date;

public class ServerConfig {
    private Integer id;

    private String serverName;

    private String serverAddr;

    private Integer serverPort;

    private Integer outTime;

    private Integer isReg;

    private Integer isEnabled;

    private Date createTime;

    private Long createUserId;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr == null ? null : serverAddr.trim();
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public Integer getOutTime() {
        return outTime;
    }

    public void setOutTime(Integer outTime) {
        this.outTime = outTime;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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