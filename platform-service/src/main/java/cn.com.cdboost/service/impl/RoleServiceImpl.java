package cn.com.cdboost.service.impl;

import cn.com.cdboost.dao.RoleMapper;
import cn.com.cdboost.model.Role;
import cn.com.cdboost.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zc
 * @desc
 * @create 2017-10-23 15:16
 **/
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public Role getRole(Long roleId) {
        return roleMapper.selectByPrimaryKey(123L);
    }
}
