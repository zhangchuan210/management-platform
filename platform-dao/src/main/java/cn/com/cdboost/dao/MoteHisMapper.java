package cn.com.cdboost.dao;

import cn.com.cdboost.model.MoteHis;
import org.springframework.stereotype.Repository;

@Repository
public interface MoteHisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MoteHis record);

    int insertSelective(MoteHis record);

    MoteHis selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MoteHis record);

    int updateByPrimaryKey(MoteHis record);
}