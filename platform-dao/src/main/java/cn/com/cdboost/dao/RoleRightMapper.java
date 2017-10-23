package cn.com.cdboost.dao;

import cn.com.cdboost.model.RoleRight;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRightMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}