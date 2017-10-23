package cn.com.cdboost.model;

import java.util.Date;

public class App {
    private Integer id;

    private Long orgNo;

    private String appEui;

    private String appName;

    private Date createTime;

    private Long createUserId;

    private Integer isReg;

    private Integer isEnabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(Long orgNo) {
        this.orgNo = orgNo;
    }

    public String getAppEui() {
        return appEui;
    }

    public void setAppEui(String appEui) {
        this.appEui = appEui == null ? null : appEui.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
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
}