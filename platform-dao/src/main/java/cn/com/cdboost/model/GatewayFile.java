package cn.com.cdboost.model;

import java.math.BigDecimal;
import java.util.Date;

public class GatewayFile {
    private Integer id;

    private String gatewayEui;

    private String fileName;

    private String filePath;

    private BigDecimal fileSize;

    private Integer fileSrc;

    private String fileRemark;

    private Date createTime;

    private Long createUserId;

    private Integer sendFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGatewayEui() {
        return gatewayEui;
    }

    public void setGatewayEui(String gatewayEui) {
        this.gatewayEui = gatewayEui == null ? null : gatewayEui.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getFileSrc() {
        return fileSrc;
    }

    public void setFileSrc(Integer fileSrc) {
        this.fileSrc = fileSrc;
    }

    public String getFileRemark() {
        return fileRemark;
    }

    public void setFileRemark(String fileRemark) {
        this.fileRemark = fileRemark == null ? null : fileRemark.trim();
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