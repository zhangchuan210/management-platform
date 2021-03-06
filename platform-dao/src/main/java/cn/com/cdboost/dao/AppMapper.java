package cn.com.cdboost.dao;

import cn.com.cdboost.model.App;
import org.springframework.stereotype.Repository;

@Repository
public interface AppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(App record);

    int insertSelective(App record);

    App selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(App record);

    int updateByPrimaryKey(App record);
}