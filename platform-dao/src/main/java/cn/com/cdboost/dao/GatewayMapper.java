package cn.com.cdboost.dao;

import cn.com.cdboost.model.Gateway;
import org.springframework.stereotype.Repository;

@Repository
public interface GatewayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Gateway record);

    int insertSelective(Gateway record);

    Gateway selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Gateway record);

    int updateByPrimaryKey(Gateway record);
}