package cn.com.cdboost.model;

import java.util.Date;

public class Menu {
    private Long menuId;

    private String menuTitle;

    private Long pMenuId;

    private String menuIcon;

    private String menuUrl;

    private Integer isLast;

    private Integer sortNo;

    private Date createTime;

    private Long createUserId;

    private Integer isEnabled;

    private String description;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle == null ? null : menuTitle.trim();
    }

    public Long getpMenuId() {
        return pMenuId;
    }

    public void setpMenuId(Long pMenuId) {
        this.pMenuId = pMenuId;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Integer getIsLast() {
        return isLast;
    }

    public void setIsLast(Integer isLast) {
        this.isLast = isLast;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}