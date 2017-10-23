package cn.com.cdboost.dao;

import cn.com.cdboost.model.Mote;
import org.springframework.stereotype.Repository;

@Repository
public interface MoteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mote record);

    int insertSelective(Mote record);

    Mote selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mote record);

    int updateByPrimaryKey(Mote record);
}