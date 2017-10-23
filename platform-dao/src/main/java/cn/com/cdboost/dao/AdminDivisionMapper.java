package cn.com.cdboost.dao;

import cn.com.cdboost.model.AdminDivision;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDivisionMapper {
    int deleteByPrimaryKey(Integer adNo);

    int insert(AdminDivision record);

    int insertSelective(AdminDivision record);

    AdminDivision selectByPrimaryKey(Integer adNo);

    int updateByPrimaryKeySelective(AdminDivision record);

    int updateByPrimaryKey(AdminDivision record);
}