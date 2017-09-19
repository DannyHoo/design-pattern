package com.danny.designpattern.creational.builder.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huyuyang@lxfintech.com
 * @Title: WangzhaojunRoleBuilder
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-18 18:23:00
 */
public class WangzhaojunRoleBuilder extends RoleBuilder {
    public void setRoleName() {
        role.setRoleName("王昭君");
    }

    public void setRoleClothes() {
        role.setClothes("精灵公主");
    }

    public void setRoleSkills() {
        List skills=new ArrayList();
        skills.add("冰冻");
        role.setSkills(skills);
    }
}
