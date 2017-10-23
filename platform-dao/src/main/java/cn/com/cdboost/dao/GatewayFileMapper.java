package cn.com.cdboost.dao;

import cn.com.cdboost.model.GatewayFile;
import org.springframework.stereotype.Repository;

@Repository
public interface GatewayFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GatewayFile record);

    int insertSelective(GatewayFile record);

    GatewayFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GatewayFile record);

    int updateByPrimaryKey(GatewayFile record);
}