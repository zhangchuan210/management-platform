package cn.com.cdboost.model;

import java.util.Date;

public class CmdTask {
    private Integer id;

    private String taskGuid;

    private String gatewayEui;

    private Date replyTime;

    private Date createTime;

    private Long createUserId;

    private Integer sendFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskGuid() {
        return taskGuid;
    }

    public void setTaskGuid(String taskGuid) {
        this.taskGuid = taskGuid == null ? null : taskGuid.trim();
    }

    public String getGatewayEui() {
        return gatewayEui;
    }

    public void setGatewayEui(String gatewayEui) {
        this.gatewayEui = gatewayEui == null ? null : gatewayEui.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
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

    public Integer getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(Integer sendFlag) {
        this.sendFlag = sendFlag;
    }
}