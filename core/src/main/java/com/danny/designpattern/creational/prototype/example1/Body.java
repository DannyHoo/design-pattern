package com.danny.designpattern.creational.prototype.example1;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Body
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-20 11:17:51
 */
public class Body implements Cloneable {

    public Body clone() throws CloneNotSupportedException {
        Body body=(Body)super.clone();
        body.head=body.head.clone();
        return body;
    }

    private Head head;

    public Head getHead() {
        return head;
    }

    public Body setHead(Head head) {
        this.head = head;
        return this;
    }
}
