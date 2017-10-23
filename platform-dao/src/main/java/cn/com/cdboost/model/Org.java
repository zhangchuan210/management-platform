package cn.com.cdboost.model;

import java.util.Date;

public class Org {
    private Long orgNo;

    private String orgName;

    private String orgAddr;

    private Long pOrgNo;

    private String firstPinyin;

    private String fullPinyin;

    private String levelCode;

    private Integer level;

    private Integer sortNo;

    private Integer isEnabled;

    private Date createTime;

    private Long createUserId;

    public Long getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(Long orgNo) {
        this.orgNo = orgNo;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgAddr() {
        return orgAddr;
    }

    public void setOrgAddr(String orgAddr) {
        this.orgAddr = orgAddr == null ? null : orgAddr.trim();
    }

    public Long getpOrgNo() {
        return pOrgNo;
    }

    public void setpOrgNo(Long pOrgNo) {
        this.pOrgNo = pOrgNo;
    }

    public String getFirstPinyin() {
        return firstPinyin;
    }

    public void setFirstPinyin(String firstPinyin) {
        this.firstPinyin = firstPinyin == null ? null : firstPinyin.trim();
    }

    public String getFullPinyin() {
        return fullPinyin;
    }

    public void setFullPinyin(String fullPinyin) {
        this.fullPinyin = fullPinyin == null ? null : fullPinyin.trim();
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode == null ? null : levelCode.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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
}