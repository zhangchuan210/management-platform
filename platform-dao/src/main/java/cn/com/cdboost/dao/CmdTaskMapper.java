package cn.com.cdboost.dao;

import cn.com.cdboost.model.CmdTask;
import cn.com.cdboost.model.CmdTaskWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface CmdTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmdTaskWithBLOBs record);

    int insertSelective(CmdTaskWithBLOBs record);

    CmdTaskWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmdTaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CmdTaskWithBLOBs record);

    int updateByPrimaryKey(CmdTask record);
}