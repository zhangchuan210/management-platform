package cn.com.cdboost.dao;

import cn.com.cdboost.model.UserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}