package cn.com.cdboost.dao;

import cn.com.cdboost.model.GatewayConf;
import org.springframework.stereotype.Repository;

@Repository
public interface GatewayConfMapper {
    int deleteByPrimaryKey(String gatewayEui);

    int insert(GatewayConf record);

    int insertSelective(GatewayConf record);

    GatewayConf selectByPrimaryKey(String gatewayEui);

    int updateByPrimaryKeySelective(GatewayConf record);

    int updateByPrimaryKey(GatewayConf record);
}