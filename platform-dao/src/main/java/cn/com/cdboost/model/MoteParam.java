package cn.com.cdboost.model;

import java.math.BigDecimal;
import java.util.Date;

public class MoteParam {
    private Long id;

    private String moteEui;

    private String modulation;

    private Integer bandwidth;

    private String channelFrequency;

    private Integer datarate;

    private BigDecimal dutyCycle;

    private Date modifyTime;

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

    public String getModulation() {
        return modulation;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation == null ? null : modulation.trim();
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getChannelFrequency() {
        return channelFrequency;
    }

    public void setChannelFrequency(String channelFrequency) {
        this.channelFrequency = channelFrequency == null ? null : channelFrequency.trim();
    }

    public Integer getDatarate() {
        return datarate;
    }

    public void setDatarate(Integer datarate) {
        this.datarate = datarate;
    }

    public BigDecimal getDutyCycle() {
        return dutyCycle;
    }

    public void setDutyCycle(BigDecimal dutyCycle) {
        this.dutyCycle = dutyCycle;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}