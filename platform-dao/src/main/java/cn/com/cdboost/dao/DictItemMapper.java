package cn.com.cdboost.dao;

import cn.com.cdboost.model.DictItem;
import org.springframework.stereotype.Repository;

@Repository
public interface DictItemMapper {
    int deleteByPrimaryKey(Long dictItemId);

    int insert(DictItem record);

    int insertSelective(DictItem record);

    DictItem selectByPrimaryKey(Long dictItemId);

    int updateByPrimaryKeySelective(DictItem record);

    int updateByPrimaryKey(DictItem record);
}