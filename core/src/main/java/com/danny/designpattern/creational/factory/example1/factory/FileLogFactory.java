package com.danny.designpattern.creational.factory.example1.factory;


import com.danny.designpattern.creational.factory.example1.log.FileLog;
import com.danny.designpattern.creational.factory.example1.log.ILog;

/**
 * @author huyuyang@lxfintech.com
 * @Title: FileLogFactory
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-23 09:48:57
 */
public class FileLogFactory /*extends AbstractLogFactory*/ implements ILogFactory {
    public ILog getLog() {
        return new FileLog();
    }
    /*public AbstractLog getLog() {
        return new FileLog();
    }*/
}
