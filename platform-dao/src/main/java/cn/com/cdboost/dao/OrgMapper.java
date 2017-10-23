package cn.com.cdboost.dao;

import cn.com.cdboost.model.Org;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgMapper {
    int deleteByPrimaryKey(Long orgNo);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(Long orgNo);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);
}