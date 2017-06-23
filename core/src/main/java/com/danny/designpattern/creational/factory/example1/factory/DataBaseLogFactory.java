package com.danny.designpattern.creational.factory.example1.factory;

import com.danny.designpattern.creational.factory.example1.log.DataBaseLog;
import com.danny.designpattern.creational.factory.example1.log.ILog;

/**
 * @author huyuyang@lxfintech.com
 * @Title: DataBaseLogFactory
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-23 09:49:19
 */
public class DataBaseLogFactory /*extends AbstractLogFactory*/ implements ILogFactory {
    public ILog getLog() {
        return new DataBaseLog();
    }

    /*public AbstractLog getLog(){
        return new DataBaseLog();
    }*/

}
