package cn.com.cdboost.dao;

import cn.com.cdboost.model.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}