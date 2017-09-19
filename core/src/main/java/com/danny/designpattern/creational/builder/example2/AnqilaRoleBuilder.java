package com.danny.designpattern.creational.builder.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huyuyang@lxfintech.com
 * @Title: AnqilaRoleBuilder
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-18 18:19:17
 */
public class AnqilaRoleBuilder extends RoleBuilder {
    public void setRoleName() {
        role.setRoleName("安其拉");
    }

    public void setRoleClothes() {
        role.setClothes("玩偶对对碰");
    }//魔法小厨娘

    public void setRoleSkills() {
        List skills=new ArrayList();
        skills.add("烈焰");
        role.setSkills(skills);
    }
}
