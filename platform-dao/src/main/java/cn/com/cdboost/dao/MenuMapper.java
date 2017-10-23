package cn.com.cdboost.dao;

import cn.com.cdboost.model.Menu;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}