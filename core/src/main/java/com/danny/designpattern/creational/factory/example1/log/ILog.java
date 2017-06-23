package com.danny.designpattern.creational.factory.example1.log;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ILog
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-23 10:12:55
 */
public interface ILog {
    void logProcess(String content);
    void logWarn(String content);
    void logError(String content);
}
