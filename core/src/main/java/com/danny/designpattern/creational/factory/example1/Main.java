package com.danny.designpattern.creational.factory.example1;

import com.danny.designpattern.creational.factory.example1.factory.DataBaseLogFactory;
import com.danny.designpattern.creational.factory.example1.factory.FileLogFactory;
import com.danny.designpattern.creational.factory.example1.factory.ILogFactory;
import com.danny.designpattern.creational.factory.example1.log.ILog;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Main
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-23 10:06:15
 */
public class Main {
    public static void main(String[] args) {
        /*ILogFactory logFactory1 = new FileLogFactory();
        AbstractLog log1=logFactory1.getLog();
        ILogFactory logFactory2 = new DataBaseLogFactory();
        AbstractLog log2=logFactory2.getLog();*/

        ILogFactory logFactory1 = new FileLogFactory();
        ILog log1=logFactory1.getLog();
        ILogFactory logFactory2 = new DataBaseLogFactory();
        ILog log2=logFactory2.getLog();
        log1.logProcess("This is the process log content.");
        log2.logProcess("This is the process log content.");
    }
}
