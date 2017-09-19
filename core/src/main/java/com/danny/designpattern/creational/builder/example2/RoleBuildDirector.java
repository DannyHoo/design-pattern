package com.danny.designpattern.creational.builder.example2;

/**
 * @author huyuyang@lxfintech.com
 * @Title: RoleBuildDirector
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-18 18:24:50
 */
public class RoleBuildDirector {
    private RoleBuilder roleBuilder;

    public RoleBuildDirector(RoleBuilder roleBuilder) {
        this.roleBuilder = roleBuilder;
    }

    public Role construct() {
        roleBuilder.setRoleName();
        roleBuilder.setRoleClothes();
        roleBuilder.setRoleSkills();
        return roleBuilder.getRole();
    }
}
