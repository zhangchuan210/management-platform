package cn.com.cdboost.model;

import java.util.Date;

public class AdminDivision {
    private Integer adNo;

    private String adName;

    private Integer pAdNo;

    private Integer adLevel;

    private String adPath;

    private String firstPinyin;

    private String fullPinyin;

    private Date createTime;

    public Integer getAdNo() {
        return adNo;
    }

    public void setAdNo(Integer adNo) {
        this.adNo = adNo;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public Integer getpAdNo() {
        return pAdNo;
    }

    public void setpAdNo(Integer pAdNo) {
        this.pAdNo = pAdNo;
    }

    public Integer getAdLevel() {
        return adLevel;
    }

    public void setAdLevel(Integer adLevel) {
        this.adLevel = adLevel;
    }

    public String getAdPath() {
        return adPath;
    }

    public void setAdPath(String adPath) {
        this.adPath = adPath == null ? null : adPath.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}