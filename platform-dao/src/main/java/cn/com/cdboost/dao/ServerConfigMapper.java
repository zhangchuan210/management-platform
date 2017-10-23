package cn.com.cdboost.dao;

import cn.com.cdboost.model.ServerConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServerConfig record);

    int insertSelective(ServerConfig record);

    ServerConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServerConfig record);

    int updateByPrimaryKey(ServerConfig record);
}