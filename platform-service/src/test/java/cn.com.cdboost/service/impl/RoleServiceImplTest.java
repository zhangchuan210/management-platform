package cn.com.cdboost.service.impl;

import cn.com.cdboost.model.Role;
import cn.com.cdboost.service.RoleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class RoleServiceImplTest extends AbstractTest {

    @Autowired
    RoleService roleService;

    @Test
    public void getRoleTest(){
        try {
        	long roleId = 0L;
            Role role = roleService.getRole(roleId);
            System.out.println(role);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
