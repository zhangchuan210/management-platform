package cn.com.cdboost.dao;

import cn.com.cdboost.model.MoteParam;
import org.springframework.stereotype.Repository;

@Repository
public interface MoteParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MoteParam record);

    int insertSelective(MoteParam record);

    MoteParam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MoteParam record);

    int updateByPrimaryKey(MoteParam record);
}