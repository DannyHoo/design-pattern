package com.danny.designpattern.creational.factory.example1.factory;

import com.danny.designpattern.creational.factory.example1.log.ILog;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ILogFactory
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-23 10:04:12
 */
public interface ILogFactory {
    //AbstractLog getLog();
    ILog getLog();
}
