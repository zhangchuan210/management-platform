package cn.com.cdboost.dao;

import cn.com.cdboost.model.MenuAction;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuActionMapper {
    int deleteByPrimaryKey(Long actionId);

    int insert(MenuAction record);

    int insertSelective(MenuAction record);

    MenuAction selectByPrimaryKey(Long actionId);

    int updateByPrimaryKeySelective(MenuAction record);

    int updateByPrimaryKey(MenuAction record);
}