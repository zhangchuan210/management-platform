package cn.com.cdboost.dao;

import cn.com.cdboost.model.Dict;
import org.springframework.stereotype.Repository;

@Repository
public interface DictMapper {
    int deleteByPrimaryKey(Long dictId);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Long dictId);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}