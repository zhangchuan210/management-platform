package cn.com.cdboost.model;

import java.util.Date;

public class MenuAction {
    private Long actionId;

    private String actionName;

    private Integer actionFlag;

    private Date createTime;

    private Long createUserId;

    private Integer isEnabled;

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public Integer getActionFlag() {
        return actionFlag;
    }

    public void setActionFlag(Integer actionFlag) {
        this.actionFlag = actionFlag;
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
}