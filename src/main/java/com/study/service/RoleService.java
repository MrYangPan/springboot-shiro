package com.study.service;

import com.github.pagehelper.PageInfo;
import com.study.model.Role;

import java.util.List;

/**
* @Author: My.PanYang
* @Date: 17:27 2018/10/26
* @Description: 
*/
public interface RoleService extends IService<Role> {

    public List<Role> queryRoleListWithSelected(Integer uid);

    PageInfo<Role> selectByPage(Role role, int start, int length);

    /**
     * 删除角色 同时删除角色资源表中的数据
     * @param roleid
     */
    public void delRole(Integer roleid);
}
