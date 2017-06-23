package com.danny.designpattern.creational.factory.example1.log;

/**
 * @author huyuyang@lxfintech.com
 * @Title: DataBaseLog
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-23 09:49:49
 */
public class DataBaseLog /*extends AbstractLog*/ implements ILog {
    public void logProcess(String content) {
        System.out.println(this.getClass().getSimpleName() + " write file process log:" + content);
    }

    public void logWarn(String content) {
        System.out.println(this.getClass().getSimpleName() + " write file warn log:" + content);
    }

    public void logError(String content) {
        System.out.println(this.getClass().getSimpleName() + " write file error log:" + content);
    }
}
