package com.danny.designpattern.creational.builder.example2;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Client
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-18 18:26:32
 */
public class Client {
    public static void main(String[] args) {
        RoleBuildDirector anqilaRoleBuildDirector = new RoleBuildDirector(new AnqilaRoleBuilder());
        Role anqila = anqilaRoleBuildDirector.construct();

        RoleBuildDirector wangzhaojunRoleBuilderDirector = new RoleBuildDirector(new WangzhaojunRoleBuilder());
        Role wangzhaojun = wangzhaojunRoleBuilderDirector.construct();

        System.out.println("英雄-" + anqila.getRoleName() + "出场，此英雄穿戴的皮肤是：" + anqila.getClothes()
                + ",拥有的技能有：" + anqila.getSkills());
        System.out.println("英雄-" + wangzhaojun.getRoleName() + "出场，此英雄穿戴的皮肤是：" + wangzhaojun.getClothes()
                + ",拥有的技能有：" + wangzhaojun.getSkills());
    }
}
